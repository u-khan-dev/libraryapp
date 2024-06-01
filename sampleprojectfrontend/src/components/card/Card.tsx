import React from 'react';
import { Book } from '../../types/types';
import './Card.scss';

const Card: React.FC<Book> = (book: Book): JSX.Element => {
    return (
        <div className='card'>
            <div className='card-header'>
                {book.title}
            </div>
            <div className='author'>
                {book.author}
            </div>
            <div className='date-published'>
                {book.datePublished}
            </div>
        </div>
    );
};

export default Card;