package bsoopsmountainarray;

public class OopsMountainArrayTarget {
	// 1095. Find in Mountain Array -3 final
	public static void main(String[] args) {
		int target = 2;
		MountainArray mountainArr = new MountainArray();
		OopsMountainArrayTarget sol = new OopsMountainArrayTarget();
		System.out.println("mountain array idex:" + sol.search(mountainArr, target));
	}

	public int search(MountainArray mountainArr, int target) {
		int peakIndex = peakIndexInMountainArray(mountainArr);
		int furstTry = orderAgnosticBs(mountainArr, target, 0, peakIndex);
		if (furstTry != -1) {
			// loop came here means found the target in 1st half as ASC order so that our
			// result, we need to break here
			return furstTry;
		}
		// loop came here means target not found in ASC order,so try in 2nd half as DESC order
		return orderAgnosticBs(mountainArr, target, peakIndex + 1, mountainArr.length() - 1);
	}

	private int orderAgnosticBs(MountainArray mountainArr, int target, int start, int end) {
		boolean isAsc = false;
		if (mountainArr.get(start) < mountainArr.get(end)) {
			isAsc = true;
		}
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == mountainArr.get(mid)) {
				return mid;
			}
			if (isAsc) {
				if (target < mountainArr.get(mid)) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target > mountainArr.get(mid)) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}

	public int peakIndexInMountainArray(MountainArray mountainArr) {
		int start = 0;
		int end = mountainArr.length() - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
				// desc
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}
}
