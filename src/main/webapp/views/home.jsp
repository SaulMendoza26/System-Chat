<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Chat Home</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <header>
        <h1>Welcome to the Chat System</h1>
    </header>
    <main>
        <section>
            <h2>Available Chat Rooms</h2>
            <ul>
                <li><a href="chatroom.jsp?room=general">General Chat</a></li>
                <li><a href="chatroom.jsp?room=tech">Tech Chat</a></li>
                <li><a href="chatroom.jsp?room=sports">Sports Chat</a></li>
            </ul>
        </section>
        <section>
            <h2>Create a New Room</h2>
            <form action="createRoom" method="post">
                <label for="roomName">Room Name:</label>
                <input type="text" id="roomName" name="roomName" required>
                <button type="submit">Create</button>
            </form>
        </section>
    </main>
    <footer>
        <p>&copy; 2023 Chat System</p>
    </footer>
</body>
</html>