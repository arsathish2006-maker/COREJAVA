const cardsArray = [
  { name: "dog", icon: '<i class="fa-solid fa-dog"></i>' },
  { name: "hippo", icon: '<i class="fa-solid fa-hippo"></i>' },
  { name: "fish", icon: '<i class="fa-solid fa-fish"></i>' },
  { name: "cat", icon: '<i class="fa-solid fa-cat"></i>' },
  { name: "spider", icon: '<i class="fa-solid fa-spider"></i>' },
  { name: "frog", icon: '<i class="fa-solid fa-frog"></i>' },
  { name: "dog", icon: '<i class="fa-solid fa-dog"></i>' },
  { name: "hippo", icon: '<i class="fa-solid fa-hippo"></i>' },
  { name: "fish", icon: '<i class="fa-solid fa-fish"></i>' },
  { name: "cat", icon: '<i class="fa-solid fa-cat"></i>' },
  { name: "spider", icon: '<i class="fa-solid fa-spider"></i>' },
  { name: "frog", icon: '<i class="fa-solid fa-frog"></i>' }
];

let flippedCards = [];
let matchedPairs = 0;

const gameBoard = document.getElementById("gameBoard");

shuffleCards();
displayCards();

// Shuffle cards
function shuffleCards() {
  for (let i = cardsArray.length - 1; i > 0; i--) {
    const randomIndex = Math.floor(Math.random() * (i + 1));
    [cardsArray[i], cardsArray[randomIndex]] = [
      cardsArray[randomIndex],
      cardsArray[i]
    ];
  }
}

// Display cards on the board
function displayCards() {
  cardsArray.forEach((cardData, index) => {
    const card = document.createElement("div");
    card.setAttribute("id", index);
    card.classList.add("cardback", "active");
    gameBoard.appendChild(card);
    card.addEventListener("click", flipCard);
  });
}

// Flip card
function flipCard() {
  if (flippedCards.length < 2 && this.classList.contains("active")) {
    const cardId = this.getAttribute("id");

    flippedCards.push(this);
    this.classList.remove("cardback");
    this.innerHTML = cardsArray[cardId].icon;

    if (flippedCards.length === 2) {
      setTimeout(checkMatch, 1000);
    }
  }
}

// Check if cards match
function checkMatch() {
  const card1Id = flippedCards[0].getAttribute("id");
  const card2Id = flippedCards[1].getAttribute("id");

  if (cardsArray[card1Id].name === cardsArray[card2Id].name) {
    flippedCards.forEach(card => {
      card.classList.remove("active");
      card.style.border = "none";
      card.style.backgroundColor = "#f5e8ba";
      card.innerHTML = "";
    });

    matchedPairs++;
    checkGameOver();
  } else {
    flippedCards.forEach(card => {
      card.innerHTML = "";
      card.classList.add("cardback");
    });
  }

  flippedCards = [];
}

// Check if game is over
function checkGameOver() {
  if (matchedPairs === cardsArray.length / 2) {
    gameBoard.innerHTML = "You Won!";
    gameBoard.classList.remove("game");
    gameBoard.classList.add("won");
  }
}
