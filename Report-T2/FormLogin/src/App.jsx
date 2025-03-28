import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import FormLogin from "./components/FormLogin";
import Profile from "./components/Profile";

function App() {
  return (
    <>
      <Router>
        <Routes>
          <Route path="/" element={<FormLogin />} />
          <Route path="/profile" element={<Profile />} />
        </Routes>
      </Router>
    </>
  );
}

export default App;
