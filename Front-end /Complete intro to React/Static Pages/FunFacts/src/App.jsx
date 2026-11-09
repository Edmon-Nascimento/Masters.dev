import reactLogo from "./assets/React.svg";
import "./index.css";

function App() {
  return (
    <>
      <header className="bg-[#21222A] w-full flex items-center gap-3 px-10 py-5">
        <img src={reactLogo} alt="" className="w-10" />
        <h1 className="text-[#61DAFB] font-bold text-2xl">ReactFacts</h1>
      </header>

      <main className=" text-white p-10">
        <h2 className="text-4xl font-semibold">Fun facts about React</h2>
        <ul className="list-disc list-inside px-8 py-5">
          <li className="my-2">Was first released in 2013</li>
          <li className="my-2">Was originally created by Jordan Walke</li>
          <li className="my-2">Has well over 100k stars on GitHub</li>
          <li className="my-2">Is maintained by Meta</li>
          <li className="my-2">Powers thousands of enterprise apps, including mobile apps</li>
        </ul>
      </main>
    </>
  );
}

export default App;
