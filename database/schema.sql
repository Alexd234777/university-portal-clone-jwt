CREATE TABLE students (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100),
  email VARCHAR(100),
  major VARCHAR(100),
  gpa DECIMAL(3,2)
);

CREATE TABLE courses (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100),
  credits INT,
  professor VARCHAR(100)
);

CREATE TABLE enrollments (
  student_id INT,
  course_id INT,
  PRIMARY KEY (student_id, course_id)
);

CREATE TABLE events (
  id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(100),
  date DATE,
  location VARCHAR(100)
);

CREATE TABLE announcements (
  id INT AUTO_INCREMENT PRIMARY KEY,
  message TEXT,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
