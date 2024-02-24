package TeoriPertemuan3.src;

abstract class OperatingSystem {
    private String name;
    private String version;

    public OperatingSystem(String name, String version) {
        this.name = name;
        this.version = version;
    }
    
    public abstract void bootUp();

    public abstract void shutDown();

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }
}

class Windows extends OperatingSystem {
    public Windows(String version) {
        super("Windows", version);
    }

    @Override
    public void bootUp() {
        System.out.println("Booting up Windows " + getVersion());
        // Additional Windows-specific boot up logic can be implemented here
    }

    @Override
    public void shutDown() {
        System.out.println("Shutting down Windows " + getVersion());
        // Additional Windows-specific shut down logic can be implemented here
    }
}

class Linux extends OperatingSystem {
    public Linux(String version) {
        super("Linux", version);
    }

    @Override
    public void bootUp() {
        System.out.println("Booting up Linux " + getVersion());
        // Additional Linux-specific boot up logic can be implemented here
    }

    @Override
    public void shutDown() {
        System.out.println("Shutting down Linux " + getVersion());
        // Additional Linux-specific shut down logic can be implemented here
    }
}

class MacOS extends OperatingSystem {
    public MacOS(String version) {
        super("MacOS", version);
    }

    @Override
    public void bootUp() {
        System.out.println("Booting up MacOS " + getVersion());
        // Additional MacOS-specific boot up logic can be implemented here
    }

    @Override
    public void shutDown() {
        System.out.println("Shutting down MacOS " + getVersion());
        // Additional Linux-specific shut down logic can be implemented here
    }
}