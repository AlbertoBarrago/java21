# Java21 MongoDB CRUD App

Java21 is an open-source Java application that exposes all the methods of a MongoDB repository and offers CRUD (Create,
Read, Update, Delete) functionality. This project is maintained by Alberto Barrago (alBz).

## Table of Contents

- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

### Prerequisites

Before you begin, ensure you have met the following requirements:

- Java 21 or higher installed on your system.
- MongoDB installed and running.

### Installation

1. **Clone the repository:**

```sh
git clone https://github.com/AlbertoBarrago/java21.git
```

Build the project:

```sh 
mvn clean install
```

Run the application:

```sh
./mvn bootRun
```

# Usage
To use this Java21 MongoDB CRUD app, you need to instantiate your own MongoDB Cloud instance and configure it to work with the provided UserDTO present in the project.

Here are the basic steps:

MongoDB Cloud Setup: Sign up for a MongoDB Cloud account and create a new cluster. Note down your MongoDB connection string.

Configuration: In the project, locate the configuration file (usually application.properties or application.yml). Update the MongoDB connection details like the connection string, database name, and credentials.

# Example application.properties:

properties
Copy code
spring.data.mongodb.uri=mongodb+srv://<username>:<password>@cluster.mongodb.net/<database>?retryWrites=true&w=majority
UserDTO: Ensure that the UserDTO class is correctly defined to match your MongoDB collection schema.

Build and Run: Rebuild the project and run it as described in the Installation section.

You can now use the CRUD operations provided by the app to interact with your MongoDB Cloud instance.

# Contributing
We welcome contributions from the community. If you'd like to contribute to this project, please follow our Contribution Guidelines.

# License
This project is licensed under the [MIT License](LICENSE). See the [LICENSE](LICENSE) file for more details.







