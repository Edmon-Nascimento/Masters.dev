import { useState } from "react";

export default function App() {
  const [tasks, setTasks] = useState<string[]>([]);
  const [newTask, setNewTask] = useState("");
  const [completedTasks, setCompletedTasks] = useState<number[]>([])

  function handleAddTask(e: React.FormEvent<HTMLFormElement>) {
    e.preventDefault();
    if (!newTask.trim()) {
      alert("Type some task before add");
      return;
    }

    setTasks([...tasks, newTask]);
    setNewTask("");
  }

  function handleMarkAsDone(indexMarkAsDone: number) {
    if(completedTasks.includes(indexMarkAsDone)){
      setCompletedTasks(completedTasks.filter(i => i!== indexMarkAsDone))
    }else{
      setCompletedTasks([...completedTasks, indexMarkAsDone])
    }
  }

  function handleDelete(indexDelete: number) {
    const deletedTasks = tasks.filter((_ ,index) => index !== indexDelete );
    setTasks(deletedTasks)
  }

  return (
    <div>
      <form onSubmit={(e) => handleAddTask(e)}>
        <input
          type="text"
          placeholder="Add a new task..."
          value={newTask}
          onChange={(e) => setNewTask(e.target.value)}
        />
        <input type="submit" value="Add Task" />
      </form>

      <ul>
        {tasks.map((item, index) => (
          <li key={index}>
            {item}
            <button onClick={() => handleMarkAsDone(index)}>
              {completedTasks.includes(index) ? "Undo" : "Mark as done"}
            </button>
            <button onClick={()=> handleDelete(index)}>Delete</button>
          </li>
        ))}
      </ul>
    </div>
  );
}
