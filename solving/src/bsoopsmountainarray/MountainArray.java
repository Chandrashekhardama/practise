package bsoopsmountainarray;

public class MountainArray implements MountainArrInt {
	//1095. Find in Mountain Array -2

	int arr[] = { 1, 5, 2 };

	@Override
	public int get(int index) {
		return arr[index];
	}

	@Override
	public int length() {
		return arr.length;
	}

}
