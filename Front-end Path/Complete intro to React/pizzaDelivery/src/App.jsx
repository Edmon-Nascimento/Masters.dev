import Order from "./components/Order";
import PizzaOfTheDay from "./components/PizzaOfTheDay";
import Header from "./components/Header";
import { CartContext } from "./context/contexts";
import { useState } from "react";

export default function App() {

  const cartHook = useState([]);

  return (
    <div>
      <CartContext value={cartHook}>
        <Header />
        <Order />
        <PizzaOfTheDay />
      </CartContext>
    </div>
  );
}
