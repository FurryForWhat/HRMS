package model;

public enum Status {
    ACTIVE,
    LEAVE,
    TEMPOFF;

    public static Status fromString(String status) {
        try {
            return Status.valueOf(status.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid status: " + status);
        }
    }
}
