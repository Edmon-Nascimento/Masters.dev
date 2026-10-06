const intl = new Intl.NumberFormat("en-US", {
  style: "currency",
  currency: "USD",
});

export default function Cart(props) {
  return (
    <div className="cart">
      <h2>Cart</h2>
      <ul>
        {props.cart.map((item, index) => (
          <li key={index}>
            <span className="size">{item.size}</span>
            <span className="type">{item.pizza.name}</span>
            <span className="price">{intl.format(item.price)}</span>
          </li>
        ))}
      </ul>
      <p>
        Total:{" "}
        {intl.format(props.cart.reduce((total, item) => total + item.price, 0))}
      </p>
      <button onClick={props.checkout}>Checkout</button>
    </div>
  );
}
