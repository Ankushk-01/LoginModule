<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background: linear-gradient(135deg, #6a11cb, #2575fc);
            color: #fff;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            overflow: hidden;
        }

        .container {
            text-align: center;
            background: rgba(255, 255, 255, 0.1);
            padding: 2rem;
            border-radius: 15px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
        }

        h1 {
            font-size: 3rem;
            margin-bottom: 1rem;
            text-shadow: 2px 4px 6px rgba(0, 0, 0, 0.2);
        }

        p {
            font-size: 1.2rem;
            margin-bottom: 2rem;
            color: #e0e0e0;
        }

        .buttons {
            display: flex;
            justify-content: center;
            gap: 1rem;
        }

        .button {
            text-decoration: none;
            color: #fff;
            background: #ff6f61;
            padding: 0.8rem 1.5rem;
            border-radius: 8px;
            font-size: 1rem;
            font-weight: bold;
            transition: transform 0.2s ease, background 0.3s ease;
        }

        .button:hover {
            background: #ff856c;
            transform: scale(1.05);
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome to the Login Module</h1>
        <p>Your one-stop solution for secure and efficient login management.</p>
        <div class="buttons">
            <a href="login.jsp" class="button">Login</a>
            <a href="signup.jsp" class="button">Sign Up</a>
        </div>
    </div>
</body>
</html>
