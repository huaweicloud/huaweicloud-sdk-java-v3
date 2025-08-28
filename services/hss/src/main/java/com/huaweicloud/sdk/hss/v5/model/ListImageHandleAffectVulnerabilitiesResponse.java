package com.huaweicloud.sdk.hss.v5.model;

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
public class ListImageHandleAffectVulnerabilitiesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_vul_num")

    private Integer totalVulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_num")

    private Integer vulNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_num")

    private Integer imageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<ImageVulResponseInfo> dataList = null;

    public ListImageHandleAffectVulnerabilitiesResponse withTotalVulNum(Integer totalVulNum) {
        this.totalVulNum = totalVulNum;
        return this;
    }

    /**
     * **参数解释**: 镜像-漏洞总条数 **取值范围**: 最小值0，最大值2147483547 
     * minimum: 0
     * maximum: 2147483547
     * @return totalVulNum
     */
    public Integer getTotalVulNum() {
        return totalVulNum;
    }

    public void setTotalVulNum(Integer totalVulNum) {
        this.totalVulNum = totalVulNum;
    }

    public ListImageHandleAffectVulnerabilitiesResponse withVulNum(Integer vulNum) {
        this.vulNum = vulNum;
        return this;
    }

    /**
     * **参数解释**: 漏洞个数 **取值范围**: 最小值0，最大值2147483547 
     * minimum: 0
     * maximum: 2147483547
     * @return vulNum
     */
    public Integer getVulNum() {
        return vulNum;
    }

    public void setVulNum(Integer vulNum) {
        this.vulNum = vulNum;
    }

    public ListImageHandleAffectVulnerabilitiesResponse withImageNum(Integer imageNum) {
        this.imageNum = imageNum;
        return this;
    }

    /**
     * **参数解释**: 镜像个数 **取值范围**: 最小值0，最大值2147483547 
     * minimum: 0
     * maximum: 2147483547
     * @return imageNum
     */
    public Integer getImageNum() {
        return imageNum;
    }

    public void setImageNum(Integer imageNum) {
        this.imageNum = imageNum;
    }

    public ListImageHandleAffectVulnerabilitiesResponse withDataList(List<ImageVulResponseInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListImageHandleAffectVulnerabilitiesResponse addDataListItem(ImageVulResponseInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListImageHandleAffectVulnerabilitiesResponse withDataList(
        Consumer<List<ImageVulResponseInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * **参数解释**: 镜像漏洞列表 **取值范围**: 最小值0，最大值5000 
     * @return dataList
     */
    public List<ImageVulResponseInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<ImageVulResponseInfo> dataList) {
        this.dataList = dataList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListImageHandleAffectVulnerabilitiesResponse that = (ListImageHandleAffectVulnerabilitiesResponse) obj;
        return Objects.equals(this.totalVulNum, that.totalVulNum) && Objects.equals(this.vulNum, that.vulNum)
            && Objects.equals(this.imageNum, that.imageNum) && Objects.equals(this.dataList, that.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalVulNum, vulNum, imageNum, dataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListImageHandleAffectVulnerabilitiesResponse {\n");
        sb.append("    totalVulNum: ").append(toIndentedString(totalVulNum)).append("\n");
        sb.append("    vulNum: ").append(toIndentedString(vulNum)).append("\n");
        sb.append("    imageNum: ").append(toIndentedString(imageNum)).append("\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
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
