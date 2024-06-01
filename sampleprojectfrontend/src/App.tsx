import React, { useEffect, useState } from 'react';
import axios from 'axios';
import { Book } from './types/types';
import Card from './components/card/Card';
import './App.scss';

const App: React.FC = (): JSX.Element => {
  const [books, setBooks] = useState([]);

  useEffect(() => {
    (async () => {
      try {
        let res = await axios.get('http://localhost:8080/api/library');
        setBooks(res.data);
      } catch(error) {
        console.error(error);
      }
    })()
  }, []);

  return (
    <div className='container'>
      <main className='main'>
        <h1> My Library </h1>
        {books.map((book: Book) => (
          <Card 
            key={book.id}
            id={book.id}
            title={book.title}
            author={book.author}
            datePublished={book.datePublished}
          />
        ))}
      </main>
    </div>
  );
};

export default App;