package model;

public enum JobType {
    PARTTIME,
    FULLTIME;

    public static JobType toString(String status){
        try{
            return JobType.valueOf(status.toUpperCase());
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Invalid job type: " + status);
        }
    }
}
