package com.huaweicloud.sdk.ges.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v1.model.Backup;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListBackupsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errorMessage")
    
    @JacksonXmlProperty(localName = "errorMessage")
    
    private String errorMessage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errorCode")
    
    @JacksonXmlProperty(localName = "errorCode")
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backupCount")
    
    @JacksonXmlProperty(localName = "backupCount")
    
    private Integer backupCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backupList")
    
    @JacksonXmlProperty(localName = "backupList")
    
    private List<Backup> backupList = null;
    
    public ListBackupsResponse withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    


    /**
     * 系统提示信息，执行成功时，字段可能为空。执行失败时，用于显示错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    

    public ListBackupsResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 系统提示信息，执行成功时，字段可能为空。执行失败时，用于显示错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    

    public ListBackupsResponse withBackupCount(Integer backupCount) {
        this.backupCount = backupCount;
        return this;
    }

    


    /**
     * 备份总个数。请求失败时，字段为空。
     * @return backupCount
     */
    public Integer getBackupCount() {
        return backupCount;
    }

    public void setBackupCount(Integer backupCount) {
        this.backupCount = backupCount;
    }

    

    public ListBackupsResponse withBackupList(List<Backup> backupList) {
        this.backupList = backupList;
        return this;
    }

    
    public ListBackupsResponse addBackupListItem(Backup backupListItem) {
        if(this.backupList == null) {
            this.backupList = new ArrayList<>();
        }
        this.backupList.add(backupListItem);
        return this;
    }

    public ListBackupsResponse withBackupList(Consumer<List<Backup>> backupListSetter) {
        if(this.backupList == null) {
            this.backupList = new ArrayList<>();
        }
        backupListSetter.accept(this.backupList);
        return this;
    }

    /**
     * 当前Project ID下的所有图的备份列表。请求失败时，字段为空。
     * @return backupList
     */
    public List<Backup> getBackupList() {
        return backupList;
    }

    public void setBackupList(List<Backup> backupList) {
        this.backupList = backupList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBackupsResponse listBackupsResponse = (ListBackupsResponse) o;
        return Objects.equals(this.errorMessage, listBackupsResponse.errorMessage) &&
            Objects.equals(this.errorCode, listBackupsResponse.errorCode) &&
            Objects.equals(this.backupCount, listBackupsResponse.backupCount) &&
            Objects.equals(this.backupList, listBackupsResponse.backupList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(errorMessage, errorCode, backupCount, backupList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBackupsResponse {\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    backupCount: ").append(toIndentedString(backupCount)).append("\n");
        sb.append("    backupList: ").append(toIndentedString(backupList)).append("\n");
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

