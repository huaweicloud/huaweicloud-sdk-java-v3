package com.huaweicloud.sdk.dcs.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.DiagnosisItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 诊断维度
 */
public class DiagnosisDimension  {

    /**
     * 诊断维度名称
     */
    public static final class NameEnum {

        
        /**
         * Enum NETWORK for value: "network"
         */
        public static final NameEnum NETWORK = new NameEnum("network");
        
        /**
         * Enum STORAGE for value: "storage"
         */
        public static final NameEnum STORAGE = new NameEnum("storage");
        
        /**
         * Enum LOAD for value: "load"
         */
        public static final NameEnum LOAD = new NameEnum("load");
        

        private static final Map<String, NameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NameEnum> createStaticFields() {
            Map<String, NameEnum> map = new HashMap<>();
            map.put("network", NETWORK);
            map.put("storage", STORAGE);
            map.put("load", LOAD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NameEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static NameEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            NameEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NameEnum(value);
            }
            return result;
        }

        public static NameEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            NameEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NameEnum) {
                return this.value.equals(((NameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private NameEnum name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="abnormal_num")
    
    private Integer abnormalNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="failed_num")
    
    private Integer failedNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="diagnosis_item_list")
    
    private List<DiagnosisItem> diagnosisItemList = null;
    
    public DiagnosisDimension withName(NameEnum name) {
        this.name = name;
        return this;
    }

    


    /**
     * 诊断维度名称
     * @return name
     */
    public NameEnum getName() {
        return name;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    

    public DiagnosisDimension withAbnormalNum(Integer abnormalNum) {
        this.abnormalNum = abnormalNum;
        return this;
    }

    


    /**
     * 诊断结果为异常的诊断项总数
     * @return abnormalNum
     */
    public Integer getAbnormalNum() {
        return abnormalNum;
    }

    public void setAbnormalNum(Integer abnormalNum) {
        this.abnormalNum = abnormalNum;
    }

    

    public DiagnosisDimension withFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
        return this;
    }

    


    /**
     * 诊断失败的诊断项总数
     * @return failedNum
     */
    public Integer getFailedNum() {
        return failedNum;
    }

    public void setFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
    }

    

    public DiagnosisDimension withDiagnosisItemList(List<DiagnosisItem> diagnosisItemList) {
        this.diagnosisItemList = diagnosisItemList;
        return this;
    }

    
    public DiagnosisDimension addDiagnosisItemListItem(DiagnosisItem diagnosisItemListItem) {
        if(this.diagnosisItemList == null) {
            this.diagnosisItemList = new ArrayList<>();
        }
        this.diagnosisItemList.add(diagnosisItemListItem);
        return this;
    }

    public DiagnosisDimension withDiagnosisItemList(Consumer<List<DiagnosisItem>> diagnosisItemListSetter) {
        if(this.diagnosisItemList == null) {
            this.diagnosisItemList = new ArrayList<>();
        }
        diagnosisItemListSetter.accept(this.diagnosisItemList);
        return this;
    }

    /**
     * 诊断项列表
     * @return diagnosisItemList
     */
    public List<DiagnosisItem> getDiagnosisItemList() {
        return diagnosisItemList;
    }

    public void setDiagnosisItemList(List<DiagnosisItem> diagnosisItemList) {
        this.diagnosisItemList = diagnosisItemList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiagnosisDimension diagnosisDimension = (DiagnosisDimension) o;
        return Objects.equals(this.name, diagnosisDimension.name) &&
            Objects.equals(this.abnormalNum, diagnosisDimension.abnormalNum) &&
            Objects.equals(this.failedNum, diagnosisDimension.failedNum) &&
            Objects.equals(this.diagnosisItemList, diagnosisDimension.diagnosisItemList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, abnormalNum, failedNum, diagnosisItemList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiagnosisDimension {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    abnormalNum: ").append(toIndentedString(abnormalNum)).append("\n");
        sb.append("    failedNum: ").append(toIndentedString(failedNum)).append("\n");
        sb.append("    diagnosisItemList: ").append(toIndentedString(diagnosisItemList)).append("\n");
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

