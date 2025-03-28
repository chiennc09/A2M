import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

export default function Profile() {
  const [user, setUser] = useState(null);
  const navigate = useNavigate();

  useEffect(() => {
    const storedUser = localStorage.getItem("user");
    if (storedUser) {
      setUser(JSON.parse(storedUser));
    } else {
      navigate("/"); // Redirect to login if no user found
    }
  }, [navigate]);

  if (!user) return null;

  return (
    <div className="flex items-center justify-center min-h-screen bg-gray-100">
      <div className="w-full max-w-md p-8 bg-white rounded-2xl shadow-lg">
        <h2 className="text-2xl font-bold text-center text-gray-800 mb-6">
          Profile
        </h2>
        <div className="space-y-2">
          <p>
            <strong>ID:</strong> {user.id}
          </p>
          <p>
            <strong>Username:</strong> {user.username}
          </p>
          <p>
            <strong>Address:</strong> {user.address}
          </p>
          <p>
            <strong>Phone:</strong> {user.phone_number}
          </p>
          <p>
            <strong>Birth Date:</strong> {user.birth_date}
          </p>
        </div>
        <button
          onClick={() => {
            localStorage.removeItem("user");
            navigate("/");
          }}
          className="w-full py-2 mt-4 bg-red-500 text-white font-semibold rounded-lg hover:bg-red-600 transition"
        >
          Logout
        </button>
      </div>
    </div>
  );
}
