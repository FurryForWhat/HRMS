package model.financial;

public enum PaymentStatus {
    PROCEEDED,
    PENDING,
    COMPLETED,
    FAILED;

    public static PaymentStatus toString(String status){
        try{
            return PaymentStatus.valueOf(status.toUpperCase());
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException(("invalid payment status:" + status));
        }
    }
}
