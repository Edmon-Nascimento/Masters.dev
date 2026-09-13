import "./App.css";
import Pizza from "./components/Pizza";

function App() {
  return (
    <>
      <h1>Padre Gino's</h1>
      <Pizza
        name="Pepperoni"
        description="pep, cheese, n stuff"
        image={"/public/pizzas/pepperoni.webp"}
      />
      <Pizza
        name="Pepperoni"
        description="pep, cheese, n stuff"
        image={"/public/pizzas/pepperoni.webp"}
      />
      <Pizza
        name="Pepperoni"
        description="pep, cheese, n stuff"
        image={"/public/pizzas/pepperoni.webp"}
      />
    </>
  );
}

export default App;
