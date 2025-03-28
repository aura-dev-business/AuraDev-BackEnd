# Aura-Dev-BackEnd

## Project Setup Guide

This guide will help you set up the backend project on your local machine and contribute effectively.

## Prerequisites

Before starting, ensure you have the following installed:

* **Java Development Kit (JDK):** Make sure you have **Java 21** installed. You can verify this by opening a terminal and running:
    ```bash
    java -version
    ```
    If Java 21 is not installed, download and install it from the [official Oracle website](https://www.oracle.com/java/technologies/javase-downloads.html) or your preferred OpenJDK distribution.

* **Maven:** This project uses Maven as its build tool. Install Maven by following the instructions on the [official Apache Maven website](https://maven.apache.org/install.html). After installation, verify it by running the following command in your terminal:
    ```bash
    mvn -v
    ```
    This should display the Maven version and other related information.

* **Git:** Required for cloning the repository and managing version control. Installation instructions can be found at [https://git-scm.com/book/en/v2/Getting-Started-Installing-Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git).

* **(Optional) Integrated Development Environment (IDE):** While not strictly required, using an IDE like IntelliJ IDEA, Eclipse, or Visual Studio Code with Java and Spring Boot extensions is highly recommended for a smoother development experience.

## Setting up the Project

Follow these steps to get the backend project running on your local machine:

1.  **Fork the Repository**

    Navigate to the [Aura-Dev-BackEnd repository]([Insert Actual Backend Repository Link Here]) on GitHub and click the **Fork** button to create a copy under your GitHub account.

2.  **Clone the Forked Repository**

    Open a terminal and run the following command, replacing `"your-forked-repo-link"` with the actual URL of your forked repository:

    ```bash
    git clone "your-forked-repo-link"
    cd Aura-Dev-BackEnd
    ```

3.  **(Skip if Initializing Project)** If you are **not** the person initializing this backend project for the first time, you can skip steps 3 and 4 and proceed directly to step 5.

4.  **(Initialize Project - One-Time Step)** If you are setting up the initial project structure:
    * Go to [https://start.spring.io/](https://start.spring.io/) in your web browser.
    * Configure your initial Spring Boot project settings. This includes:
        * **Project:** Choose `Maven`.
        * **Language:** Select `Java`.
        * **Spring Boot:** Choose a stable version (e.g., the latest recommended).
        * **Group:** Define your project's group ID (e.g., `com.auradev`).
        * **Artifact:** Define your project's artifact ID (e.g., `auradev-backend`).
        * Add any necessary dependencies based on the project's requirements (e.g., Spring Web, Spring Data JPA, etc.).
    * Click the **Generate** button to download a ZIP file of the initial project structure.
    * Unzip the downloaded project into the root directory of the **forked repository** you cloned in step 2. Ensure that the `pom.xml` file and the `src` directory are at the top level of your local `Aura-Dev-BackEnd` folder.

5.  **Verify Java Installation**

    Open a terminal within your project directory and confirm that Java 21 is correctly installed:

    ```bash
    java -version
    ```
    You should see output indicating Java version "21" (or a later update).

6.  **Verify Maven Installation**

    In the same terminal, verify that Maven is installed and configured correctly:

    ```bash
    mvn -v
    ```
    This command should display the Maven version and other details.

7.  **Open the Project in Your IDE**

    Open your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse) and import the `Aura-Dev-BackEnd` project. If you are using IntelliJ IDEA, you can typically open the `pom.xml` file directly.

8.  **Run the Application**

    You can run the Spring Boot application using the Maven Wrapper (`mvnw`) included in the project. Open a terminal in the root directory of the project and execute the following command:

    ```bash
    ./mvnw spring-boot:run
    ```
    The first time you run this command, Maven will download the necessary dependencies. Subsequent runs will be faster.

9.  **Test the Initial Endpoint**

    Once the application has started successfully (you should see logs indicating the server has started), you can test the initial "hello" endpoint by opening your web browser or using a tool like `curl` and navigating to the following URL:

    ```
    http://localhost:8080/hello
    ```
    You should receive a response from the application (likely a simple greeting).

**Note on Embedded Server:** This Spring Boot application comes with an embedded web server (typically Tomcat) by default. This means you **do not** need to install and configure a separate web server to run the application locally.

## Contributing to the Project

Follow these steps to contribute to the backend project:

1.  **Create a New Branch**

    Before making any changes, switch to a new branch from the `main` branch:

    ```bash
    git checkout -b "your-feature-branch-name"
    ```
    Choose a descriptive branch name that reflects the changes you are about to make (e.g., `feature/user-authentication`, `bugfix/data-validation`).

2.  **Make Changes**

    Implement your changes in the codebase using your IDE or text editor.

3.  **Add Changes Before Commit**

    Stage the changes you want to commit:

    ```bash
    git add .
    ```
    You can also use `git add <specific_file>` to stage individual files.

4.  **Commit Changes**

    Commit your staged changes with a clear and concise commit message:

    ```bash
    git commit -m "Implement user registration API endpoint"
    ```
    Follow established commit message conventions for better project history.

5.  **Push to Your Forked Repository**

    Push your new branch to your forked repository on GitHub:

    ```bash
    git push origin "your-feature-branch-name"
    ```

6.  **Create a Pull Request (PR)**

    * Go to your **forked repository** on GitHub in your web browser.
    * You should see a notification about your newly pushed branch. Click the **Compare & pull request** button.
    * Ensure that the base repository is set to the original `aura-dev-business/Aura-Dev-FrontEnd` (or the correct backend repository) and the compare branch is your newly created branch.
    * Provide a meaningful title and a detailed description of the changes included in your pull request. Explain the purpose of your changes and any relevant context.
    * Click **Create pull request** to submit it for review.

## Keeping Your Fork Up-to-Date

It's important to keep your forked repository synchronized with the original repository to avoid merge conflicts and ensure you are working with the latest codebase:

1.  **Add the Original Repository as a Remote (Only Needed Once)**

    If you haven't already, add the original Aura-Dev-BackEnd repository as a remote named `upstream`:

    ```bash
    git remote add upstream [https://github.com/aura-dev-business/Aura-Dev-BackEnd.git](https://www.google.com/search?q=https://github.com/aura-dev-business/Aura-Dev-BackEnd.git)
    ```

2.  **Fetch the Latest Changes from the Original Repo**

    ```bash
    git fetch upstream
    ```
    This command downloads the commits and branches from the `upstream` repository without merging them into your local branches.

3.  **Merge the Latest Changes into Your `main` Branch**

    Switch to your local `main` branch and merge the changes from the `upstream/main` branch:

    ```bash
    git checkout main
    git merge upstream/main
    ```
    If there are no conflicts, this will integrate the latest changes into your local `main` branch. If conflicts arise, you will need to resolve them manually.

4.  **Push the Updated `main` Branch to Your Fork**

    Finally, push the updated `main` branch to your forked repository on GitHub:

    ```bash
    git push origin main
    ```

Now your fork's `main` branch is up-to-date with the original repository. Remember to repeat steps 2-4 periodically to stay synchronized.