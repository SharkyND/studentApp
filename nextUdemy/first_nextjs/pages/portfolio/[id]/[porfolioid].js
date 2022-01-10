import { useRouter } from 'next/router';

function PortfolioID() {
  const router = useRouter();

  const dynamicName = router.query["porfolioid"];

  return (<h1>The page name is {dynamicName}</h1>);
}

export default PortfolioID;