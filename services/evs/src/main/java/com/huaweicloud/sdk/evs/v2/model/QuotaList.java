package com.huaweicloud.sdk.evs.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.QuotaDetail;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * QuotaList
 */
public class QuotaList  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_gigabytes")
    
    private QuotaDetail backupGigabytes = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backups")
    
    private QuotaDetail backups = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gigabytes")
    
    private QuotaDetail gigabytes = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="snapshots")
    
    private QuotaDetail snapshots = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumes")
    
    private QuotaDetail volumes = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gigabytes_SATA")
    
    private QuotaDetail gigabytesSATA = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="snapshots_SATA")
    
    private QuotaDetail snapshotsSATA = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumes_SATA")
    
    private QuotaDetail volumesSATA = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gigabytes_SAS")
    
    private QuotaDetail gigabytesSAS = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="snapshots_SAS")
    
    private QuotaDetail snapshotsSAS = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumes_SAS")
    
    private QuotaDetail volumesSAS = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gigabytes_SSD")
    
    private QuotaDetail gigabytesSSD = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="snapshots_SSD")
    
    private QuotaDetail snapshotsSSD = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumes_SSD")
    
    private QuotaDetail volumesSSD = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gigabytes_GPSSD")
    
    private QuotaDetail gigabytesGPSSD = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="snapshots_GPSSD")
    
    private QuotaDetail snapshotsGPSSD = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumes_GPSSD")
    
    private QuotaDetail volumesGPSSD = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="per_volume_gigabytes")
    
    private QuotaDetail perVolumeGigabytes = null;

    public QuotaList withBackupGigabytes(QuotaDetail backupGigabytes) {
        this.backupGigabytes = backupGigabytes;
        return this;
    }

    public QuotaList withBackupGigabytes(Consumer<QuotaDetail> backupGigabytesSetter) {
        if(this.backupGigabytes == null ){
            this.backupGigabytes = new QuotaDetail();
            backupGigabytesSetter.accept(this.backupGigabytes);
        }
        
        return this;
    }


    /**
     * Get backupGigabytes
     * @return backupGigabytes
     */
    public QuotaDetail getBackupGigabytes() {
        return backupGigabytes;
    }

    public void setBackupGigabytes(QuotaDetail backupGigabytes) {
        this.backupGigabytes = backupGigabytes;
    }

    public QuotaList withBackups(QuotaDetail backups) {
        this.backups = backups;
        return this;
    }

    public QuotaList withBackups(Consumer<QuotaDetail> backupsSetter) {
        if(this.backups == null ){
            this.backups = new QuotaDetail();
            backupsSetter.accept(this.backups);
        }
        
        return this;
    }


    /**
     * Get backups
     * @return backups
     */
    public QuotaDetail getBackups() {
        return backups;
    }

    public void setBackups(QuotaDetail backups) {
        this.backups = backups;
    }

    public QuotaList withGigabytes(QuotaDetail gigabytes) {
        this.gigabytes = gigabytes;
        return this;
    }

    public QuotaList withGigabytes(Consumer<QuotaDetail> gigabytesSetter) {
        if(this.gigabytes == null ){
            this.gigabytes = new QuotaDetail();
            gigabytesSetter.accept(this.gigabytes);
        }
        
        return this;
    }


    /**
     * Get gigabytes
     * @return gigabytes
     */
    public QuotaDetail getGigabytes() {
        return gigabytes;
    }

    public void setGigabytes(QuotaDetail gigabytes) {
        this.gigabytes = gigabytes;
    }

    public QuotaList withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 项目ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QuotaList withSnapshots(QuotaDetail snapshots) {
        this.snapshots = snapshots;
        return this;
    }

    public QuotaList withSnapshots(Consumer<QuotaDetail> snapshotsSetter) {
        if(this.snapshots == null ){
            this.snapshots = new QuotaDetail();
            snapshotsSetter.accept(this.snapshots);
        }
        
        return this;
    }


    /**
     * Get snapshots
     * @return snapshots
     */
    public QuotaDetail getSnapshots() {
        return snapshots;
    }

    public void setSnapshots(QuotaDetail snapshots) {
        this.snapshots = snapshots;
    }

    public QuotaList withVolumes(QuotaDetail volumes) {
        this.volumes = volumes;
        return this;
    }

    public QuotaList withVolumes(Consumer<QuotaDetail> volumesSetter) {
        if(this.volumes == null ){
            this.volumes = new QuotaDetail();
            volumesSetter.accept(this.volumes);
        }
        
        return this;
    }


    /**
     * Get volumes
     * @return volumes
     */
    public QuotaDetail getVolumes() {
        return volumes;
    }

    public void setVolumes(QuotaDetail volumes) {
        this.volumes = volumes;
    }

    public QuotaList withGigabytesSATA(QuotaDetail gigabytesSATA) {
        this.gigabytesSATA = gigabytesSATA;
        return this;
    }

    public QuotaList withGigabytesSATA(Consumer<QuotaDetail> gigabytesSATASetter) {
        if(this.gigabytesSATA == null ){
            this.gigabytesSATA = new QuotaDetail();
            gigabytesSATASetter.accept(this.gigabytesSATA);
        }
        
        return this;
    }


    /**
     * Get gigabytesSATA
     * @return gigabytesSATA
     */
    public QuotaDetail getGigabytesSATA() {
        return gigabytesSATA;
    }

    public void setGigabytesSATA(QuotaDetail gigabytesSATA) {
        this.gigabytesSATA = gigabytesSATA;
    }

    public QuotaList withSnapshotsSATA(QuotaDetail snapshotsSATA) {
        this.snapshotsSATA = snapshotsSATA;
        return this;
    }

    public QuotaList withSnapshotsSATA(Consumer<QuotaDetail> snapshotsSATASetter) {
        if(this.snapshotsSATA == null ){
            this.snapshotsSATA = new QuotaDetail();
            snapshotsSATASetter.accept(this.snapshotsSATA);
        }
        
        return this;
    }


    /**
     * Get snapshotsSATA
     * @return snapshotsSATA
     */
    public QuotaDetail getSnapshotsSATA() {
        return snapshotsSATA;
    }

    public void setSnapshotsSATA(QuotaDetail snapshotsSATA) {
        this.snapshotsSATA = snapshotsSATA;
    }

    public QuotaList withVolumesSATA(QuotaDetail volumesSATA) {
        this.volumesSATA = volumesSATA;
        return this;
    }

    public QuotaList withVolumesSATA(Consumer<QuotaDetail> volumesSATASetter) {
        if(this.volumesSATA == null ){
            this.volumesSATA = new QuotaDetail();
            volumesSATASetter.accept(this.volumesSATA);
        }
        
        return this;
    }


    /**
     * Get volumesSATA
     * @return volumesSATA
     */
    public QuotaDetail getVolumesSATA() {
        return volumesSATA;
    }

    public void setVolumesSATA(QuotaDetail volumesSATA) {
        this.volumesSATA = volumesSATA;
    }

    public QuotaList withGigabytesSAS(QuotaDetail gigabytesSAS) {
        this.gigabytesSAS = gigabytesSAS;
        return this;
    }

    public QuotaList withGigabytesSAS(Consumer<QuotaDetail> gigabytesSASSetter) {
        if(this.gigabytesSAS == null ){
            this.gigabytesSAS = new QuotaDetail();
            gigabytesSASSetter.accept(this.gigabytesSAS);
        }
        
        return this;
    }


    /**
     * Get gigabytesSAS
     * @return gigabytesSAS
     */
    public QuotaDetail getGigabytesSAS() {
        return gigabytesSAS;
    }

    public void setGigabytesSAS(QuotaDetail gigabytesSAS) {
        this.gigabytesSAS = gigabytesSAS;
    }

    public QuotaList withSnapshotsSAS(QuotaDetail snapshotsSAS) {
        this.snapshotsSAS = snapshotsSAS;
        return this;
    }

    public QuotaList withSnapshotsSAS(Consumer<QuotaDetail> snapshotsSASSetter) {
        if(this.snapshotsSAS == null ){
            this.snapshotsSAS = new QuotaDetail();
            snapshotsSASSetter.accept(this.snapshotsSAS);
        }
        
        return this;
    }


    /**
     * Get snapshotsSAS
     * @return snapshotsSAS
     */
    public QuotaDetail getSnapshotsSAS() {
        return snapshotsSAS;
    }

    public void setSnapshotsSAS(QuotaDetail snapshotsSAS) {
        this.snapshotsSAS = snapshotsSAS;
    }

    public QuotaList withVolumesSAS(QuotaDetail volumesSAS) {
        this.volumesSAS = volumesSAS;
        return this;
    }

    public QuotaList withVolumesSAS(Consumer<QuotaDetail> volumesSASSetter) {
        if(this.volumesSAS == null ){
            this.volumesSAS = new QuotaDetail();
            volumesSASSetter.accept(this.volumesSAS);
        }
        
        return this;
    }


    /**
     * Get volumesSAS
     * @return volumesSAS
     */
    public QuotaDetail getVolumesSAS() {
        return volumesSAS;
    }

    public void setVolumesSAS(QuotaDetail volumesSAS) {
        this.volumesSAS = volumesSAS;
    }

    public QuotaList withGigabytesSSD(QuotaDetail gigabytesSSD) {
        this.gigabytesSSD = gigabytesSSD;
        return this;
    }

    public QuotaList withGigabytesSSD(Consumer<QuotaDetail> gigabytesSSDSetter) {
        if(this.gigabytesSSD == null ){
            this.gigabytesSSD = new QuotaDetail();
            gigabytesSSDSetter.accept(this.gigabytesSSD);
        }
        
        return this;
    }


    /**
     * Get gigabytesSSD
     * @return gigabytesSSD
     */
    public QuotaDetail getGigabytesSSD() {
        return gigabytesSSD;
    }

    public void setGigabytesSSD(QuotaDetail gigabytesSSD) {
        this.gigabytesSSD = gigabytesSSD;
    }

    public QuotaList withSnapshotsSSD(QuotaDetail snapshotsSSD) {
        this.snapshotsSSD = snapshotsSSD;
        return this;
    }

    public QuotaList withSnapshotsSSD(Consumer<QuotaDetail> snapshotsSSDSetter) {
        if(this.snapshotsSSD == null ){
            this.snapshotsSSD = new QuotaDetail();
            snapshotsSSDSetter.accept(this.snapshotsSSD);
        }
        
        return this;
    }


    /**
     * Get snapshotsSSD
     * @return snapshotsSSD
     */
    public QuotaDetail getSnapshotsSSD() {
        return snapshotsSSD;
    }

    public void setSnapshotsSSD(QuotaDetail snapshotsSSD) {
        this.snapshotsSSD = snapshotsSSD;
    }

    public QuotaList withVolumesSSD(QuotaDetail volumesSSD) {
        this.volumesSSD = volumesSSD;
        return this;
    }

    public QuotaList withVolumesSSD(Consumer<QuotaDetail> volumesSSDSetter) {
        if(this.volumesSSD == null ){
            this.volumesSSD = new QuotaDetail();
            volumesSSDSetter.accept(this.volumesSSD);
        }
        
        return this;
    }


    /**
     * Get volumesSSD
     * @return volumesSSD
     */
    public QuotaDetail getVolumesSSD() {
        return volumesSSD;
    }

    public void setVolumesSSD(QuotaDetail volumesSSD) {
        this.volumesSSD = volumesSSD;
    }

    public QuotaList withGigabytesGPSSD(QuotaDetail gigabytesGPSSD) {
        this.gigabytesGPSSD = gigabytesGPSSD;
        return this;
    }

    public QuotaList withGigabytesGPSSD(Consumer<QuotaDetail> gigabytesGPSSDSetter) {
        if(this.gigabytesGPSSD == null ){
            this.gigabytesGPSSD = new QuotaDetail();
            gigabytesGPSSDSetter.accept(this.gigabytesGPSSD);
        }
        
        return this;
    }


    /**
     * Get gigabytesGPSSD
     * @return gigabytesGPSSD
     */
    public QuotaDetail getGigabytesGPSSD() {
        return gigabytesGPSSD;
    }

    public void setGigabytesGPSSD(QuotaDetail gigabytesGPSSD) {
        this.gigabytesGPSSD = gigabytesGPSSD;
    }

    public QuotaList withSnapshotsGPSSD(QuotaDetail snapshotsGPSSD) {
        this.snapshotsGPSSD = snapshotsGPSSD;
        return this;
    }

    public QuotaList withSnapshotsGPSSD(Consumer<QuotaDetail> snapshotsGPSSDSetter) {
        if(this.snapshotsGPSSD == null ){
            this.snapshotsGPSSD = new QuotaDetail();
            snapshotsGPSSDSetter.accept(this.snapshotsGPSSD);
        }
        
        return this;
    }


    /**
     * Get snapshotsGPSSD
     * @return snapshotsGPSSD
     */
    public QuotaDetail getSnapshotsGPSSD() {
        return snapshotsGPSSD;
    }

    public void setSnapshotsGPSSD(QuotaDetail snapshotsGPSSD) {
        this.snapshotsGPSSD = snapshotsGPSSD;
    }

    public QuotaList withVolumesGPSSD(QuotaDetail volumesGPSSD) {
        this.volumesGPSSD = volumesGPSSD;
        return this;
    }

    public QuotaList withVolumesGPSSD(Consumer<QuotaDetail> volumesGPSSDSetter) {
        if(this.volumesGPSSD == null ){
            this.volumesGPSSD = new QuotaDetail();
            volumesGPSSDSetter.accept(this.volumesGPSSD);
        }
        
        return this;
    }


    /**
     * Get volumesGPSSD
     * @return volumesGPSSD
     */
    public QuotaDetail getVolumesGPSSD() {
        return volumesGPSSD;
    }

    public void setVolumesGPSSD(QuotaDetail volumesGPSSD) {
        this.volumesGPSSD = volumesGPSSD;
    }

    public QuotaList withPerVolumeGigabytes(QuotaDetail perVolumeGigabytes) {
        this.perVolumeGigabytes = perVolumeGigabytes;
        return this;
    }

    public QuotaList withPerVolumeGigabytes(Consumer<QuotaDetail> perVolumeGigabytesSetter) {
        if(this.perVolumeGigabytes == null ){
            this.perVolumeGigabytes = new QuotaDetail();
            perVolumeGigabytesSetter.accept(this.perVolumeGigabytes);
        }
        
        return this;
    }


    /**
     * Get perVolumeGigabytes
     * @return perVolumeGigabytes
     */
    public QuotaDetail getPerVolumeGigabytes() {
        return perVolumeGigabytes;
    }

    public void setPerVolumeGigabytes(QuotaDetail perVolumeGigabytes) {
        this.perVolumeGigabytes = perVolumeGigabytes;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuotaList quotaList = (QuotaList) o;
        return Objects.equals(this.backupGigabytes, quotaList.backupGigabytes) &&
            Objects.equals(this.backups, quotaList.backups) &&
            Objects.equals(this.gigabytes, quotaList.gigabytes) &&
            Objects.equals(this.id, quotaList.id) &&
            Objects.equals(this.snapshots, quotaList.snapshots) &&
            Objects.equals(this.volumes, quotaList.volumes) &&
            Objects.equals(this.gigabytesSATA, quotaList.gigabytesSATA) &&
            Objects.equals(this.snapshotsSATA, quotaList.snapshotsSATA) &&
            Objects.equals(this.volumesSATA, quotaList.volumesSATA) &&
            Objects.equals(this.gigabytesSAS, quotaList.gigabytesSAS) &&
            Objects.equals(this.snapshotsSAS, quotaList.snapshotsSAS) &&
            Objects.equals(this.volumesSAS, quotaList.volumesSAS) &&
            Objects.equals(this.gigabytesSSD, quotaList.gigabytesSSD) &&
            Objects.equals(this.snapshotsSSD, quotaList.snapshotsSSD) &&
            Objects.equals(this.volumesSSD, quotaList.volumesSSD) &&
            Objects.equals(this.gigabytesGPSSD, quotaList.gigabytesGPSSD) &&
            Objects.equals(this.snapshotsGPSSD, quotaList.snapshotsGPSSD) &&
            Objects.equals(this.volumesGPSSD, quotaList.volumesGPSSD) &&
            Objects.equals(this.perVolumeGigabytes, quotaList.perVolumeGigabytes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(backupGigabytes, backups, gigabytes, id, snapshots, volumes, gigabytesSATA, snapshotsSATA, volumesSATA, gigabytesSAS, snapshotsSAS, volumesSAS, gigabytesSSD, snapshotsSSD, volumesSSD, gigabytesGPSSD, snapshotsGPSSD, volumesGPSSD, perVolumeGigabytes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaList {\n");
        sb.append("    backupGigabytes: ").append(toIndentedString(backupGigabytes)).append("\n");
        sb.append("    backups: ").append(toIndentedString(backups)).append("\n");
        sb.append("    gigabytes: ").append(toIndentedString(gigabytes)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        sb.append("    gigabytesSATA: ").append(toIndentedString(gigabytesSATA)).append("\n");
        sb.append("    snapshotsSATA: ").append(toIndentedString(snapshotsSATA)).append("\n");
        sb.append("    volumesSATA: ").append(toIndentedString(volumesSATA)).append("\n");
        sb.append("    gigabytesSAS: ").append(toIndentedString(gigabytesSAS)).append("\n");
        sb.append("    snapshotsSAS: ").append(toIndentedString(snapshotsSAS)).append("\n");
        sb.append("    volumesSAS: ").append(toIndentedString(volumesSAS)).append("\n");
        sb.append("    gigabytesSSD: ").append(toIndentedString(gigabytesSSD)).append("\n");
        sb.append("    snapshotsSSD: ").append(toIndentedString(snapshotsSSD)).append("\n");
        sb.append("    volumesSSD: ").append(toIndentedString(volumesSSD)).append("\n");
        sb.append("    gigabytesGPSSD: ").append(toIndentedString(gigabytesGPSSD)).append("\n");
        sb.append("    snapshotsGPSSD: ").append(toIndentedString(snapshotsGPSSD)).append("\n");
        sb.append("    volumesGPSSD: ").append(toIndentedString(volumesGPSSD)).append("\n");
        sb.append("    perVolumeGigabytes: ").append(toIndentedString(perVolumeGigabytes)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
}

