import React, {useState} from 'react';
import axios from 'axios';

export default function Login() {
  const [username, setUsername] = useState('student');
  const [password, setPassword] = useState('studentpass');
  const [message, setMessage] = useState('');

  const handleLogin = async (e) => {
    e.preventDefault();
    try {
      const res = await axios.post('http://localhost:8080/api/auth/login', { username, password });
      const token = res.data.token;
      localStorage.setItem('jwt', token);
      setMessage('Logged in! Token saved.');
    } catch (err) {
      setMessage('Login failed');
    }
  };

  return (
    <main>
      <h1>Login</h1>
      <form onSubmit={handleLogin}>
        <label>Username</label>
        <input value={username} onChange={e=>setUsername(e.target.value)} />
        <label>Password</label>
        <input type="password" value={password} onChange={e=>setPassword(e.target.value)} />
        <button type="submit">Login</button>
      </form>
      <p>{message}</p>
      <p>Demo users: <strong>admin/adminpass</strong> or <strong>student/studentpass</strong></p>
    </main>
  );
}
