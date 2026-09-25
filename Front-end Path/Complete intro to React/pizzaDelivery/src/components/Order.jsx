import { useState, useEffect } from "react";

import Pizza from "./Pizza";

const intl = new Intl.NumberFormat("en-US", {
  style: "currency",
  currency: "USD",
});

export default function Order() {
  const [pizzaTypes, setPizzaTypes] = useState([]);
  const [pizzaType, setPizzaType] = useState("Pepperoni");
  const [pizzaSize, setPizzaSize] = useState("Medium");
  const [loading, setLoading] = useState(true);

  let price, selectedPizza;

  if (!loading) {
    selectedPizza = pizzaTypes.find((pizza) => pizza.name === pizzaType);
  }

  useEffect(() => {
    async function fetchPizzaTypes() {
      const response = await fetch("/api/pizzas");
      const data = await response.json();
      
      setPizzaTypes(data);
      setLoading(false);
    }
    fetchPizzaTypes();
  }, []);

  return (
    <div className="order">
      <h2>Create Order</h2>
      <form action="">
        <div>
          <div>
            <label htmlFor="pizza-type">Pizza Type:</label>
            <select
              name="pizza-type"
              id="pizza-type"
              value={pizzaType}
              onChange={(e) => setPizzaType(e.target.value)}
            >
              {pizzaTypes.map((pizza) => (
                <option key={pizza.name} value={pizza.id}>
                  {pizza.name}
                </option>
              ))}
            </select>
          </div>
          <div>
            <label htmlFor="pizza-size">Pizza Size:</label>
            <div>
              <span>
                <input
                  type="radio"
                  name="pizza-size"
                  value="Small"
                  id="small"
                  checked={pizzaSize === "Small"}
                  onChange={(e) => setPizzaSize(e.target.value)}
                />
                <label htmlFor="small">Small</label>
              </span>

              <span>
                <input
                  type="radio"
                  name="pizza-size"
                  value="Medium"
                  id="medium"
                  checked={pizzaSize === "Medium"}
                  onChange={(e) => setPizzaSize(e.target.value)}
                />
                <label htmlFor="medium">Medium</label>
              </span>

              <span>
                <input
                  type="radio"
                  name="pizza-size"
                  value="Large"
                  id="large"
                  checked={pizzaSize === "Large"}
                  onChange={(e) => setPizzaSize(e.target.value)}
                />
                <label htmlFor="large">Large</label>
              </span>
            </div>
          </div>
          <button type="submit">Add to Cart</button>
          <div className="order-pizza">
            <Pizza
              name={pizzaType}
              description={`${pizzaSize} size`}
              image={`/public/pizzas/${pizzaType.toLowerCase()}.webp`}
            />
            <p>
              Price: $
              {pizzaSize === "Small" ? 8 : pizzaSize === "Medium" ? 10 : 12}
            </p>
          </div>
        </div>
      </form>
    </div>
  );
}
