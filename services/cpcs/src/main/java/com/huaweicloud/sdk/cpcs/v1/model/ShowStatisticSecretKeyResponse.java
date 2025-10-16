package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowStatisticSecretKeyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invalid_count")

    private Integer invalidCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_count")

    private Integer validCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_counts_by_service_type")

    private List<VendorKeyStatistic> keyCountsByServiceType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_counts_by_algorithm")

    private List<VendorKeyStatistic> keyCountsByAlgorithm = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_counts_by_algorithm_and_cluster")

    private List<VendorKeyStatistic> keyCountsByAlgorithmAndCluster = null;

    public ShowStatisticSecretKeyResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数量
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ShowStatisticSecretKeyResponse withInvalidCount(Integer invalidCount) {
        this.invalidCount = invalidCount;
        return this;
    }

    /**
     * 无效数量
     * @return invalidCount
     */
    public Integer getInvalidCount() {
        return invalidCount;
    }

    public void setInvalidCount(Integer invalidCount) {
        this.invalidCount = invalidCount;
    }

    public ShowStatisticSecretKeyResponse withValidCount(Integer validCount) {
        this.validCount = validCount;
        return this;
    }

    /**
     * 有效数量
     * @return validCount
     */
    public Integer getValidCount() {
        return validCount;
    }

    public void setValidCount(Integer validCount) {
        this.validCount = validCount;
    }

    public ShowStatisticSecretKeyResponse withKeyCountsByServiceType(List<VendorKeyStatistic> keyCountsByServiceType) {
        this.keyCountsByServiceType = keyCountsByServiceType;
        return this;
    }

    public ShowStatisticSecretKeyResponse addKeyCountsByServiceTypeItem(VendorKeyStatistic keyCountsByServiceTypeItem) {
        if (this.keyCountsByServiceType == null) {
            this.keyCountsByServiceType = new ArrayList<>();
        }
        this.keyCountsByServiceType.add(keyCountsByServiceTypeItem);
        return this;
    }

    public ShowStatisticSecretKeyResponse withKeyCountsByServiceType(
        Consumer<List<VendorKeyStatistic>> keyCountsByServiceTypeSetter) {
        if (this.keyCountsByServiceType == null) {
            this.keyCountsByServiceType = new ArrayList<>();
        }
        keyCountsByServiceTypeSetter.accept(this.keyCountsByServiceType);
        return this;
    }

    /**
     * 密钥分布按服务类型统计
     * @return keyCountsByServiceType
     */
    public List<VendorKeyStatistic> getKeyCountsByServiceType() {
        return keyCountsByServiceType;
    }

    public void setKeyCountsByServiceType(List<VendorKeyStatistic> keyCountsByServiceType) {
        this.keyCountsByServiceType = keyCountsByServiceType;
    }

    public ShowStatisticSecretKeyResponse withKeyCountsByAlgorithm(List<VendorKeyStatistic> keyCountsByAlgorithm) {
        this.keyCountsByAlgorithm = keyCountsByAlgorithm;
        return this;
    }

    public ShowStatisticSecretKeyResponse addKeyCountsByAlgorithmItem(VendorKeyStatistic keyCountsByAlgorithmItem) {
        if (this.keyCountsByAlgorithm == null) {
            this.keyCountsByAlgorithm = new ArrayList<>();
        }
        this.keyCountsByAlgorithm.add(keyCountsByAlgorithmItem);
        return this;
    }

    public ShowStatisticSecretKeyResponse withKeyCountsByAlgorithm(
        Consumer<List<VendorKeyStatistic>> keyCountsByAlgorithmSetter) {
        if (this.keyCountsByAlgorithm == null) {
            this.keyCountsByAlgorithm = new ArrayList<>();
        }
        keyCountsByAlgorithmSetter.accept(this.keyCountsByAlgorithm);
        return this;
    }

    /**
     * 密钥分布按算法统计
     * @return keyCountsByAlgorithm
     */
    public List<VendorKeyStatistic> getKeyCountsByAlgorithm() {
        return keyCountsByAlgorithm;
    }

    public void setKeyCountsByAlgorithm(List<VendorKeyStatistic> keyCountsByAlgorithm) {
        this.keyCountsByAlgorithm = keyCountsByAlgorithm;
    }

    public ShowStatisticSecretKeyResponse withKeyCountsByAlgorithmAndCluster(
        List<VendorKeyStatistic> keyCountsByAlgorithmAndCluster) {
        this.keyCountsByAlgorithmAndCluster = keyCountsByAlgorithmAndCluster;
        return this;
    }

    public ShowStatisticSecretKeyResponse addKeyCountsByAlgorithmAndClusterItem(
        VendorKeyStatistic keyCountsByAlgorithmAndClusterItem) {
        if (this.keyCountsByAlgorithmAndCluster == null) {
            this.keyCountsByAlgorithmAndCluster = new ArrayList<>();
        }
        this.keyCountsByAlgorithmAndCluster.add(keyCountsByAlgorithmAndClusterItem);
        return this;
    }

    public ShowStatisticSecretKeyResponse withKeyCountsByAlgorithmAndCluster(
        Consumer<List<VendorKeyStatistic>> keyCountsByAlgorithmAndClusterSetter) {
        if (this.keyCountsByAlgorithmAndCluster == null) {
            this.keyCountsByAlgorithmAndCluster = new ArrayList<>();
        }
        keyCountsByAlgorithmAndClusterSetter.accept(this.keyCountsByAlgorithmAndCluster);
        return this;
    }

    /**
     * 密钥分布按算法和集群统计
     * @return keyCountsByAlgorithmAndCluster
     */
    public List<VendorKeyStatistic> getKeyCountsByAlgorithmAndCluster() {
        return keyCountsByAlgorithmAndCluster;
    }

    public void setKeyCountsByAlgorithmAndCluster(List<VendorKeyStatistic> keyCountsByAlgorithmAndCluster) {
        this.keyCountsByAlgorithmAndCluster = keyCountsByAlgorithmAndCluster;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStatisticSecretKeyResponse that = (ShowStatisticSecretKeyResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.invalidCount, that.invalidCount)
            && Objects.equals(this.validCount, that.validCount)
            && Objects.equals(this.keyCountsByServiceType, that.keyCountsByServiceType)
            && Objects.equals(this.keyCountsByAlgorithm, that.keyCountsByAlgorithm)
            && Objects.equals(this.keyCountsByAlgorithmAndCluster, that.keyCountsByAlgorithmAndCluster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount,
            invalidCount,
            validCount,
            keyCountsByServiceType,
            keyCountsByAlgorithm,
            keyCountsByAlgorithmAndCluster);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStatisticSecretKeyResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    invalidCount: ").append(toIndentedString(invalidCount)).append("\n");
        sb.append("    validCount: ").append(toIndentedString(validCount)).append("\n");
        sb.append("    keyCountsByServiceType: ").append(toIndentedString(keyCountsByServiceType)).append("\n");
        sb.append("    keyCountsByAlgorithm: ").append(toIndentedString(keyCountsByAlgorithm)).append("\n");
        sb.append("    keyCountsByAlgorithmAndCluster: ")
            .append(toIndentedString(keyCountsByAlgorithmAndCluster))
            .append("\n");
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
