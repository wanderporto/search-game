import React from 'react';
import { Link } from 'react-router-dom';

type Props = {
    link: string;
    linkText: string;
}

const Filters = ({ link, linkText }: Props) => {
    return (
        <div className="filters-container records-actions">
            <Link to={link}>
                <button className="action-filter">
                    {linkText}
                </button>
            </Link>
        </div>
    );
};

export default Filters;