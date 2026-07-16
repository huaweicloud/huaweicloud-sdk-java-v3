package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteDomainSetResponseDatas
 */
public class DeleteDomainSetResponseDatas {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "responseDatas")

    private List<DomainSetId> responseDatas = null;

    public DeleteDomainSetResponseDatas withResponseDatas(List<DomainSetId> responseDatas) {
        this.responseDatas = responseDatas;
        return this;
    }

    public DeleteDomainSetResponseDatas addResponseDatasItem(DomainSetId responseDatasItem) {
        if (this.responseDatas == null) {
            this.responseDatas = new ArrayList<>();
        }
        this.responseDatas.add(responseDatasItem);
        return this;
    }

    public DeleteDomainSetResponseDatas withResponseDatas(Consumer<List<DomainSetId>> responseDatasSetter) {
        if (this.responseDatas == null) {
            this.responseDatas = new ArrayList<>();
        }
        responseDatasSetter.accept(this.responseDatas);
        return this;
    }

    /**
     * **参数解释**： 批量删除域名组响应信息 **取值范围**： 不涉及 
     * @return responseDatas
     */
    public List<DomainSetId> getResponseDatas() {
        return responseDatas;
    }

    public void setResponseDatas(List<DomainSetId> responseDatas) {
        this.responseDatas = responseDatas;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteDomainSetResponseDatas that = (DeleteDomainSetResponseDatas) obj;
        return Objects.equals(this.responseDatas, that.responseDatas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseDatas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDomainSetResponseDatas {\n");
        sb.append("    responseDatas: ").append(toIndentedString(responseDatas)).append("\n");
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
