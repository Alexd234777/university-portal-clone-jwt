import React from 'react';
import { useState, useEffect } from 'react';
import axios from 'axios';

function App() {
  const [students, setStudents] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/api/students')
      .then(response => setStudents(response.data))
      .catch(error => console.error(error));
  }, []);

  return (
    <div>
      <h1>University Portal</h1>
      <h2>Students</h2>
      <ul>
        {students.map(s => (
          <li key={s.id}>{s.name} - {s.major} (GPA: {s.gpa})</li>
        ))}
      </ul>
    </div>
  );
}

export default App;
