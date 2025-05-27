console.log("Welcome to the Community Portal");
window.onload = function () {
  alert("Page is fully loaded");
};
const eventName = "Music Festival";
const eventDate = "2025-07-01";
let availableSeats = 50;
console.log(
  `Event: ${eventName}, Date: ${eventDate}, Seats: ${availableSeats}`
);
availableSeats--;
const events = [
  { name: "Yoga Camp", date: "2025-06-10", seats: 10 },
  { name: "Art Workshop", date: "2024-12-10", seats: 0 },
];

const today = new Date("2025-01-01");
events.forEach((e) => {
  const eventDate = new Date(e.date);
  if (eventDate > today && e.seats > 0) {
    console.log("Upcoming Event:", e.name);
  } else {
    console.log("Not showing:", e.name);
  }
});

try {
  if (availableSeats <= 0) throw "No seats available";
  console.log("Registered successfully!");
} catch (err) {
  console.error("Error:", err);
}

function addEvent(name, date, seats, category) {
  events.push({ name, date, seats, category });
}

function registerUser(eventName) {
  console.log(`Registered for ${eventName}`);
}

function filterEventsByCategory(category) {
  return events.filter((e) => e.category === category);
}

function createCategoryCounter() {
  let count = 0;
  return function () {
    count++;
    return count;
  };
}

function dynamicFilter(events, callback) {
  return events.filter(callback);
}
function Event(name, date, seats) {
  this.name = name;
  this.date = date;
  this.seats = seats;
}

Event.prototype.checkAvailability = function () {
  return this.seats > 0;
};

const yoga = new Event("Yoga Retreat", "2025-09-10", 20);
console.log(Object.entries(yoga));
const eventList = ["Music Show", "Dance Night", "Tech Talk"];
eventList.push("Baking Workshop");
const musicEvents = eventList.filter((e) => e.includes("Music"));
const formattedEvents = eventList.map((e) => `Event: ${e}`);
const container = document.querySelector("#eventContainer");
eventList.forEach((event) => {
  const div = document.createElement("div");
  div.className = "eventCard";
  div.innerText = event;
  container.appendChild(div);
});
document.querySelector("#registerBtn").onclick = () => alert("Registered!");
document.querySelector("#categoryFilter").onchange = (e) =>
  alert(`Selected: ${e.target.value}`);
document.querySelector("#searchBox").onkeydown = (e) => console.log(e.key);
function fetchEvents() {
  fetch("https://jsonplaceholder.typicode.com/posts")
    .then((res) => res.json())
    .then((data) => console.log(data))
    .catch((err) => console.error(err));
}

async function loadEvents() {
  console.log("Loading...");
  try {
    const res = await fetch("https://jsonplaceholder.typicode.com/posts");
    const data = await res.json();
    console.log(data);
  } catch (err) {
    console.error("Error:", err);
  }
}
const [first, second] = eventList;
const newList = [...eventList];
function showEvent(name = "Unknown") {
  console.log(`Welcome to ${name}`);
}
document.querySelector("#eventForm").addEventListener("submit", (e) => {
  e.preventDefault();
  const name = e.target.elements.name.value;
  const email = e.target.elements.email.value;
  if (!name || !email) {
    document.querySelector("#error").innerText = "All fields required!";
  } else {
    alert(`Thanks, ${name}`);
  }
});
function registerUserAJAX(data) {
  setTimeout(() => {
    fetch("https://jsonplaceholder.typicode.com/posts", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(data),
    })
      .then((res) => res.json())
      .then((data) => alert("Registered successfully!"))
      .catch((err) => alert("Registration failed"));
  }, 1000);
}

console.log("Submitting form");

$(document).ready(function () {
  $("#registerBtn").click(function () {
    alert("jQuery Register!");
  });

  $(".eventCard").fadeIn();
  setTimeout(() => $(".eventCard").fadeOut(), 3000);

  console.log("React simplifies component reuse and state management");
});
