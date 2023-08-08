# Setting Up Java Development Environments 

## Prerequisites

- Windows operating system or Linux 0r MacOS
- Internet connection
- Administrative privileges (for installation)

## Setup on Windows (Using Visual Studio Code or IntelliJ IDEA)

This guide will walk you through the process of setting up a Java development environment on a Windows operating system using your choice of either Visual Studio Code or IntelliJ IDEA.


## Steps For Windows Setup

### Using Visual Studio Code

1. **Download and Install Java Development Kit (JDK)**

   - Visit the [Oracle JDK download page](https://www.oracle.com/java/technologies/javase-jdk16-downloads.html) (you may need to create an Oracle account or sign in).
   - Download the latest version of the JDK for Windows (e.g., `jdk-16.0.1_windows-x64_bin.exe`).
   - Run the installer and follow the on-screen instructions to complete the installation. Note the installation path (e.g., `C:\Program Files\Java\jdk16.0.1`).

2. **Set Java Environment Variables**

   - Right-click on the `This PC` (or `My Computer`) icon and select `Properties`.
   - Click on `Advanced system settings` on the left.
   - In the `System Properties` window, click the `Environment Variables` button.
   - Under `System Variables`, click `New` and add the following variables:
     - `JAVA_HOME`: Set this to the JDK installation path (e.g., `C:\Program Files\Java\jdk16.0.1`).
     - `Path`: Append `%JAVA_HOME%\bin` to the existing `Path` variable.

3. **Download and Install Visual Studio Code**

   - Visit the [Visual Studio Code download page](https://code.visualstudio.com/download) and download the installer.
   - Run the installer and follow the on-screen instructions to complete the installation.

4. **Install Java Extensions**

   - Launch Visual Studio Code.
   - Open the Extensions view by clicking on the square icon in the sidebar or pressing `Ctrl+Shift+X`.
   - Search for "Java Extension Pack" and install it.

5. **Create Your First Java Project**

   - Click on `File` > `Open Folder` and create a new folder for your Java project.
   - Inside the folder, create a new Java file (e.g., `HelloWorld.java`).
   - Write your Java code in the file.

6. **Run Your Java Application**

   - Right-click inside the Java file and select `Run Java`.

### Using IntelliJ IDEA

1. **Download and Install IntelliJ IDEA**

   - Visit the [IntelliJ IDEA download page](https://www.jetbrains.com/idea/download) and download the Community Edition installer.
   - Run the installer and follow the on-screen instructions to complete the installation.

2. **Create a New Project**

   - Launch IntelliJ IDEA.
   - Click on `Create New Project` or select `File` > `New` > `Project`.
   - Choose `Java` and click `Next`.
   - Configure your project settings and click `Finish`.

3. **Write and Run Your Java Code**

   - In the project view, right-click on the `src` folder and select `New` > `Java Class`.
   - Enter a class name (e.g., `HelloWorld`) and click `OK`.
   - Write your Java code in the class.
   - Right-click inside the class and select `Run 'HelloWorld.main()'`.

## Setting Up Java Development Environment on Linux and macOS (Using Visual Studio Code or IntelliJ IDEA)

This guide will walk you through the process of setting up a Java development environment on Linux and macOS operating systems using your choice of either Visual Studio Code or IntelliJ IDEA.

## Steps for Linux and MacOs

### Using Visual Studio Code

1. **Download and Install Java Development Kit (JDK)**

   - Visit the [Oracle JDK download page](https://www.oracle.com/java/technologies/javase-jdk16-downloads.html).
   - Download the latest version of the JDK for Linux or macOS (e.g., `jdk-16.0.1_linux-x64_bin.tar.gz`).
   - Extract the downloaded archive to a location of your choice (e.g., `/usr/local/java`).

2. **Set Java Environment Variables**

   - Open a terminal window.
   - Edit your shell profile configuration file (`~/.bashrc` for Linux or `~/.zshrc` for macOS) using a text editor (e.g., `nano`, `vim`, or `code`).
   - Add the following lines at the end of the file:
     ```bash
     export JAVA_HOME=/usr/local/java/jdk16.0.1
     export PATH=$PATH:$JAVA_HOME/bin
     ```
   - Save the file and run `source ~/.bashrc` (or `source ~/.zshrc`) to apply the changes.

3. **Download and Install Visual Studio Code**

   - Visit the [Visual Studio Code download page](https://code.visualstudio.com/download).
   - Download the appropriate installer for Linux or macOS.
   - Install Visual Studio Code by following the provided instructions.

4. **Install Java Extensions**

   - Launch Visual Studio Code.
   - Open the Extensions view by clicking on the square icon in the sidebar or pressing `Ctrl+Shift+X`.
   - Search for "Java Extension Pack" and install it.

5. **Create Your First Java Project**

   - Click on `File` > `Open Folder` and create a new folder for your Java project.
   - Inside the folder, create a new Java file (e.g., `HelloWorld.java`).
   - Write your Java code in the file.

6. **Run Your Java Application**

   - Right-click inside the Java file and select `Run Java`.

### Using IntelliJ IDEA

1. **Download and Install IntelliJ IDEA**

   - Visit the [IntelliJ IDEA download page](https://www.jetbrains.com/idea/download) and download the Community Edition installer for Linux or macOS.
   - Install IntelliJ IDEA by following the provided instructions.

2. **Create a New Project**

   - Launch IntelliJ IDEA.
   - Click on `Create New Project` or select `File` > `New` > `Project`.
   - Choose `Java` and click `Next`.
   - Configure your project settings and click `Finish`.

3. **Write and Run Your Java Code**

   - In the project view, right-click on the `src` folder and select `New` > `Java Class`.
   - Enter a class name (e.g., `HelloWorld`) and click `OK`.
   - Write your Java code in the class.
   - Right-click inside the class and select `Run 'HelloWorld.main()'`.

Congratulations! You've successfully set up a Java development environment on Windows, Linux or macOS using either Visual Studio Code or IntelliJ IDEA.

Happy coding!

