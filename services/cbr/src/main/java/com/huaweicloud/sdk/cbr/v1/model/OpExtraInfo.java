package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * OpExtraInfo
 */
public class OpExtraInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup")

    @JacksonXmlProperty(localName = "backup")

    private OpExtendInfoBckup backup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common")

    @JacksonXmlProperty(localName = "common")

    private OpExtendInfoCommon common;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete")

    @JacksonXmlProperty(localName = "delete")

    private OpExtendInfoDelete delete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync")

    @JacksonXmlProperty(localName = "sync")

    private OpExtendInfoSync sync;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remove_resources")

    @JacksonXmlProperty(localName = "remove_resources")

    private OpExtendInfoRemoveResources removeResources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication")

    @JacksonXmlProperty(localName = "replication")

    private OpExtendInfoReplication replication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    @JacksonXmlProperty(localName = "resource")

    private Resource resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore")

    @JacksonXmlProperty(localName = "restore")

    private OpExtendInfoRestore restore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_delete")

    @JacksonXmlProperty(localName = "vault_delete")

    private OpExtendInfoVaultDelete vaultDelete;

    public OpExtraInfo withBackup(OpExtendInfoBckup backup) {
        this.backup = backup;
        return this;
    }

    public OpExtraInfo withBackup(Consumer<OpExtendInfoBckup> backupSetter) {
        if (this.backup == null) {
            this.backup = new OpExtendInfoBckup();
            backupSetter.accept(this.backup);
        }

        return this;
    }

    /**
     * Get backup
     * @return backup
     */
    public OpExtendInfoBckup getBackup() {
        return backup;
    }

    public void setBackup(OpExtendInfoBckup backup) {
        this.backup = backup;
    }

    public OpExtraInfo withCommon(OpExtendInfoCommon common) {
        this.common = common;
        return this;
    }

    public OpExtraInfo withCommon(Consumer<OpExtendInfoCommon> commonSetter) {
        if (this.common == null) {
            this.common = new OpExtendInfoCommon();
            commonSetter.accept(this.common);
        }

        return this;
    }

    /**
     * Get common
     * @return common
     */
    public OpExtendInfoCommon getCommon() {
        return common;
    }

    public void setCommon(OpExtendInfoCommon common) {
        this.common = common;
    }

    public OpExtraInfo withDelete(OpExtendInfoDelete delete) {
        this.delete = delete;
        return this;
    }

    public OpExtraInfo withDelete(Consumer<OpExtendInfoDelete> deleteSetter) {
        if (this.delete == null) {
            this.delete = new OpExtendInfoDelete();
            deleteSetter.accept(this.delete);
        }

        return this;
    }

    /**
     * Get delete
     * @return delete
     */
    public OpExtendInfoDelete getDelete() {
        return delete;
    }

    public void setDelete(OpExtendInfoDelete delete) {
        this.delete = delete;
    }

    public OpExtraInfo withSync(OpExtendInfoSync sync) {
        this.sync = sync;
        return this;
    }

    public OpExtraInfo withSync(Consumer<OpExtendInfoSync> syncSetter) {
        if (this.sync == null) {
            this.sync = new OpExtendInfoSync();
            syncSetter.accept(this.sync);
        }

        return this;
    }

    /**
     * Get sync
     * @return sync
     */
    public OpExtendInfoSync getSync() {
        return sync;
    }

    public void setSync(OpExtendInfoSync sync) {
        this.sync = sync;
    }

    public OpExtraInfo withRemoveResources(OpExtendInfoRemoveResources removeResources) {
        this.removeResources = removeResources;
        return this;
    }

    public OpExtraInfo withRemoveResources(Consumer<OpExtendInfoRemoveResources> removeResourcesSetter) {
        if (this.removeResources == null) {
            this.removeResources = new OpExtendInfoRemoveResources();
            removeResourcesSetter.accept(this.removeResources);
        }

        return this;
    }

    /**
     * Get removeResources
     * @return removeResources
     */
    public OpExtendInfoRemoveResources getRemoveResources() {
        return removeResources;
    }

    public void setRemoveResources(OpExtendInfoRemoveResources removeResources) {
        this.removeResources = removeResources;
    }

    public OpExtraInfo withReplication(OpExtendInfoReplication replication) {
        this.replication = replication;
        return this;
    }

    public OpExtraInfo withReplication(Consumer<OpExtendInfoReplication> replicationSetter) {
        if (this.replication == null) {
            this.replication = new OpExtendInfoReplication();
            replicationSetter.accept(this.replication);
        }

        return this;
    }

    /**
     * Get replication
     * @return replication
     */
    public OpExtendInfoReplication getReplication() {
        return replication;
    }

    public void setReplication(OpExtendInfoReplication replication) {
        this.replication = replication;
    }

    public OpExtraInfo withResource(Resource resource) {
        this.resource = resource;
        return this;
    }

    public OpExtraInfo withResource(Consumer<Resource> resourceSetter) {
        if (this.resource == null) {
            this.resource = new Resource();
            resourceSetter.accept(this.resource);
        }

        return this;
    }

    /**
     * Get resource
     * @return resource
     */
    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public OpExtraInfo withRestore(OpExtendInfoRestore restore) {
        this.restore = restore;
        return this;
    }

    public OpExtraInfo withRestore(Consumer<OpExtendInfoRestore> restoreSetter) {
        if (this.restore == null) {
            this.restore = new OpExtendInfoRestore();
            restoreSetter.accept(this.restore);
        }

        return this;
    }

    /**
     * Get restore
     * @return restore
     */
    public OpExtendInfoRestore getRestore() {
        return restore;
    }

    public void setRestore(OpExtendInfoRestore restore) {
        this.restore = restore;
    }

    public OpExtraInfo withVaultDelete(OpExtendInfoVaultDelete vaultDelete) {
        this.vaultDelete = vaultDelete;
        return this;
    }

    public OpExtraInfo withVaultDelete(Consumer<OpExtendInfoVaultDelete> vaultDeleteSetter) {
        if (this.vaultDelete == null) {
            this.vaultDelete = new OpExtendInfoVaultDelete();
            vaultDeleteSetter.accept(this.vaultDelete);
        }

        return this;
    }

    /**
     * Get vaultDelete
     * @return vaultDelete
     */
    public OpExtendInfoVaultDelete getVaultDelete() {
        return vaultDelete;
    }

    public void setVaultDelete(OpExtendInfoVaultDelete vaultDelete) {
        this.vaultDelete = vaultDelete;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpExtraInfo opExtraInfo = (OpExtraInfo) o;
        return Objects.equals(this.backup, opExtraInfo.backup) && Objects.equals(this.common, opExtraInfo.common)
            && Objects.equals(this.delete, opExtraInfo.delete) && Objects.equals(this.sync, opExtraInfo.sync)
            && Objects.equals(this.removeResources, opExtraInfo.removeResources)
            && Objects.equals(this.replication, opExtraInfo.replication)
            && Objects.equals(this.resource, opExtraInfo.resource) && Objects.equals(this.restore, opExtraInfo.restore)
            && Objects.equals(this.vaultDelete, opExtraInfo.vaultDelete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backup, common, delete, sync, removeResources, replication, resource, restore, vaultDelete);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpExtraInfo {\n");
        sb.append("    backup: ").append(toIndentedString(backup)).append("\n");
        sb.append("    common: ").append(toIndentedString(common)).append("\n");
        sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
        sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
        sb.append("    removeResources: ").append(toIndentedString(removeResources)).append("\n");
        sb.append("    replication: ").append(toIndentedString(replication)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    restore: ").append(toIndentedString(restore)).append("\n");
        sb.append("    vaultDelete: ").append(toIndentedString(vaultDelete)).append("\n");
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
