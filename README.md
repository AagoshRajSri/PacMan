# PacMan

A simple Pac-Man game made with Java Swing.

## Download

Download the latest Windows version from the [GitHub Releases page](../../releases/latest) once a release is published.

### Installation

1. Download the Windows ZIP.
2. Extract the ZIP.
3. Open the extracted `PacMan` folder.
4. Double-click `PacMan.exe`.

## Run

Make sure Java is installed, then run:

```bash
javac -d bin src/*.java
cp src/*.png bin/
java -cp bin App
```

On Windows PowerShell, use this instead of the `cp` command:

```powershell
Copy-Item src\*.png bin\
```

## Controls

- Arrow keys: Move Pac-Man

## About

This is a small Java project created to practice object-oriented programming, game logic, keyboard controls, collision detection, and Java Swing graphics.
