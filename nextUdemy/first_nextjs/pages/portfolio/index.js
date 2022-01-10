import React, { Component } from 'react';
import { useRouter } from 'next/router';


function PortforlioPage() {
  const router = useRouter();

  const string = `The Porfolio Page is ${router.query}`;

  return (
    <h1>{string}</h1>
  );
}

export default PortforlioPage;