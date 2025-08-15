package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {

	private final UserRepository userRepository;

	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	// Add User
	@PostMapping
	public ResponseEntity<User> addUser(@RequestBody User user) {
		return ResponseEntity.ok(userRepository.save(user));
	}

	// Modify User
	@PutMapping("/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User userDetails) {
		Optional<User> optionalUser = userRepository.findById(id);
		if (optionalUser.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		User user = optionalUser.get();
		user.setName(userDetails.getName());
		user.setEmail(userDetails.getEmail());
		user.setPassword(userDetails.getPassword());
		return ResponseEntity.ok(userRepository.save(user));
	}

	// Delete User
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
		if (!userRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		userRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}

	// Get All Users with filtering example
	@GetMapping
	public List<User> getAllUsers(@RequestParam(required = false) String mobile,
			@RequestParam(required = false) String nameContains) {
		return userRepository.findAll().stream().filter(us->us.getName().equalsIgnoreCase(nameContains)).toList();
				// Filter by ISD code if provided
//				.filter(user -> mobile == null || mobile.equals(user.getMobile()))
//				// Filter by name containing a substring (case-insensitive)
//				.filter(user -> nameContains == null
//						|| user.getName().toLowerCase().contains(nameContains.toLowerCase()))
//				.toList();
	}

	// Get User by ID
//	@GetMapping("/{id}")
//	public ResponseEntity<User> getUserById(@PathVariable Long id) {
//		return userRepository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
//	}
	@GetMapping("/{id}")
	public User getUserById(@PathVariable Long id) {
		Optional<User> findById = userRepository.findById(id);
		User user = findById.get();
		return user;
	}
}
