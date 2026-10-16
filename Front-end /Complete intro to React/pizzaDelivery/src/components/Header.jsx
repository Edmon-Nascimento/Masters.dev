import { useContext } from "react";
import { CartContext } from "../context/contexts";

export default function Header() {

  const [cart] = useContext(CartContext)

  return (
    <header>
      <nav>
        <h1 className="logo">Padre Gino's Pizza</h1>
        <div className="nav-cart">
          🛒<span className="nav-cart-number">{cart.length}</span>
        </div>
      </nav>
    </header>
  );
}
