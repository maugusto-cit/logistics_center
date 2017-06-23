package br.com.cit.logistics_center.domain.wrappers;

/**
 * Created by neto on 21/06/17.
 */
public class Step {

    private int step;

    private Long packageId;

    private String from;

    private String to;

    public Step (int step, Long packageId, String from, String to) {
        this.step = step;
        this.packageId = packageId;
        this.from = from;
        this.to = to;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public Long getPackageId() {
        return packageId;
    }

    public void setPackageId(Long packageId) {
        this.packageId = packageId;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
