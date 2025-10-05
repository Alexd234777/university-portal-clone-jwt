import React, {useEffect, useState} from 'react';
import API from '../api';

export default function Dashboard(){
  const [profile, setProfile] = useState(null);
  const [message, setMessage] = useState('');

  useEffect(()=>{
    API.get('/students/1').then(r=>setProfile(r.data)).catch(()=>setMessage('Not authorized or student not found'));
  },[]);

  return (
    <main>
      <h1>Dashboard</h1>
      {profile ? (
        <section>
          <h2>Welcome, {profile.name}</h2>
          <p>Major: {profile.major}</p>
        </section>
      ) : (
        <p>{message || 'Loading...'}</p>
      )}
    </main>
  );
}
