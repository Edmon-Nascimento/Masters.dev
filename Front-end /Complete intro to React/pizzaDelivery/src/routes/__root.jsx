import { useState } from "react";
import { createRoute, Outlet } from "@tanstack/react-router";
import PizzaOfTheDay from "../components/PizzaOfTheDay";
import Header from "../components/Header";
import { CartContext } from "../context/contexts";

export const Route = createRoute({
  component: () => {
    const cartHook = useState([])
    return (
      <CartContext value={cartHook}>
        <div>
            <Header />
            <Outlet />
            <PizzaOfTheDay />
        </div>
      </CartContext>
    );
  },
});
