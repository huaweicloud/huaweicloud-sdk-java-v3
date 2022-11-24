package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class HealthCodeResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idcard_number")

    private String idcardNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_number")

    private String phoneNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "province")

    private String province;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "city")

    private String city;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "color")

    private String color;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vaccination_status")

    private String vaccinationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_interval")

    private String testInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pcr_test_result")

    private String pcrTestResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pcr_test_organization")

    private String pcrTestOrganization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pcr_test_time")

    private String pcrTestTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pcr_sampling_time")

    private String pcrSamplingTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reached_city")

    private List<String> reachedCity = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Object confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_block_count")

    private Integer wordsBlockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "words_block_list")

    private List<HealthCodeWordsBlockList> wordsBlockList = null;

    public HealthCodeResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 防疫码类别： - 健康码：health_code - 核酸检测记录：pcr_test_record - 通信行程卡：travel_card - 其他：other 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HealthCodeResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 姓名 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HealthCodeResult withIdcardNumber(String idcardNumber) {
        this.idcardNumber = idcardNumber;
        return this;
    }

    /**
     * 身份证号码 
     * @return idcardNumber
     */
    public String getIdcardNumber() {
        return idcardNumber;
    }

    public void setIdcardNumber(String idcardNumber) {
        this.idcardNumber = idcardNumber;
    }

    public HealthCodeResult withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * 手机号码 
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public HealthCodeResult withProvince(String province) {
        this.province = province;
        return this;
    }

    /**
     * 省份 
     * @return province
     */
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public HealthCodeResult withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * 城市 
     * @return city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public HealthCodeResult withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 健康码或行程卡的更新时间 
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public HealthCodeResult withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * 健康码或行程卡颜色。 健康码颜色可选值包括：  - \"green\"，绿码 - \"yellow\"，黄码 - \"red\"，红码 - \"gray\"，灰码  行程卡颜色可选值包括：  - \"green\"，绿码 - \"yellow\"，黄码 - \"red\"，红码 
     * @return color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public HealthCodeResult withVaccinationStatus(String vaccinationStatus) {
        this.vaccinationStatus = vaccinationStatus;
        return this;
    }

    /**
     * 疫苗接种情况，可选值包括：  - 未接种 - 接种中 - 无接种记录 - 已接种1针 - 已接种2针 - 已接种3针 - 已完成新冠疫苗接种 
     * @return vaccinationStatus
     */
    public String getVaccinationStatus() {
        return vaccinationStatus;
    }

    public void setVaccinationStatus(String vaccinationStatus) {
        this.vaccinationStatus = vaccinationStatus;
    }

    public HealthCodeResult withTestInterval(String testInterval) {
        this.testInterval = testInterval;
        return this;
    }

    /**
     * 核酸检测间隔时长，可选值包括： - 24小时内 - 48小时内 - 72小时内 - 5天内 - 7天内 - 7天外 
     * @return testInterval
     */
    public String getTestInterval() {
        return testInterval;
    }

    public void setTestInterval(String testInterval) {
        this.testInterval = testInterval;
    }

    public HealthCodeResult withPcrTestResult(String pcrTestResult) {
        this.pcrTestResult = pcrTestResult;
        return this;
    }

    /**
     * 核酸检测结果，可选值包括： - \"positive\",即阳性 - \"negative\",即阴性 - \"unknown\",未知 
     * @return pcrTestResult
     */
    public String getPcrTestResult() {
        return pcrTestResult;
    }

    public void setPcrTestResult(String pcrTestResult) {
        this.pcrTestResult = pcrTestResult;
    }

    public HealthCodeResult withPcrTestOrganization(String pcrTestOrganization) {
        this.pcrTestOrganization = pcrTestOrganization;
        return this;
    }

    /**
     * 核酸检测机构 
     * @return pcrTestOrganization
     */
    public String getPcrTestOrganization() {
        return pcrTestOrganization;
    }

    public void setPcrTestOrganization(String pcrTestOrganization) {
        this.pcrTestOrganization = pcrTestOrganization;
    }

    public HealthCodeResult withPcrTestTime(String pcrTestTime) {
        this.pcrTestTime = pcrTestTime;
        return this;
    }

    /**
     * 核酸检测结果更新时间 
     * @return pcrTestTime
     */
    public String getPcrTestTime() {
        return pcrTestTime;
    }

    public void setPcrTestTime(String pcrTestTime) {
        this.pcrTestTime = pcrTestTime;
    }

    public HealthCodeResult withPcrSamplingTime(String pcrSamplingTime) {
        this.pcrSamplingTime = pcrSamplingTime;
        return this;
    }

    /**
     * 核酸检测采样时间 
     * @return pcrSamplingTime
     */
    public String getPcrSamplingTime() {
        return pcrSamplingTime;
    }

    public void setPcrSamplingTime(String pcrSamplingTime) {
        this.pcrSamplingTime = pcrSamplingTime;
    }

    public HealthCodeResult withReachedCity(List<String> reachedCity) {
        this.reachedCity = reachedCity;
        return this;
    }

    public HealthCodeResult addReachedCityItem(String reachedCityItem) {
        if (this.reachedCity == null) {
            this.reachedCity = new ArrayList<>();
        }
        this.reachedCity.add(reachedCityItem);
        return this;
    }

    public HealthCodeResult withReachedCity(Consumer<List<String>> reachedCitySetter) {
        if (this.reachedCity == null) {
            this.reachedCity = new ArrayList<>();
        }
        reachedCitySetter.accept(this.reachedCity);
        return this;
    }

    /**
     * 行程卡的途径地址 
     * @return reachedCity
     */
    public List<String> getReachedCity() {
        return reachedCity;
    }

    public void setReachedCity(List<String> reachedCity) {
        this.reachedCity = reachedCity;
    }

    public HealthCodeResult withConfidence(Object confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 各个字段的置信度。 
     * @return confidence
     */
    public Object getConfidence() {
        return confidence;
    }

    public void setConfidence(Object confidence) {
        this.confidence = confidence;
    }

    public HealthCodeResult withWordsBlockCount(Integer wordsBlockCount) {
        this.wordsBlockCount = wordsBlockCount;
        return this;
    }

    /**
     * 代表检测识别出来的文字块数目。 
     * @return wordsBlockCount
     */
    public Integer getWordsBlockCount() {
        return wordsBlockCount;
    }

    public void setWordsBlockCount(Integer wordsBlockCount) {
        this.wordsBlockCount = wordsBlockCount;
    }

    public HealthCodeResult withWordsBlockList(List<HealthCodeWordsBlockList> wordsBlockList) {
        this.wordsBlockList = wordsBlockList;
        return this;
    }

    public HealthCodeResult addWordsBlockListItem(HealthCodeWordsBlockList wordsBlockListItem) {
        if (this.wordsBlockList == null) {
            this.wordsBlockList = new ArrayList<>();
        }
        this.wordsBlockList.add(wordsBlockListItem);
        return this;
    }

    public HealthCodeResult withWordsBlockList(Consumer<List<HealthCodeWordsBlockList>> wordsBlockListSetter) {
        if (this.wordsBlockList == null) {
            this.wordsBlockList = new ArrayList<>();
        }
        wordsBlockListSetter.accept(this.wordsBlockList);
        return this;
    }

    /**
     * 识别文字块列表，输出顺序从左到右，从上到下。 
     * @return wordsBlockList
     */
    public List<HealthCodeWordsBlockList> getWordsBlockList() {
        return wordsBlockList;
    }

    public void setWordsBlockList(List<HealthCodeWordsBlockList> wordsBlockList) {
        this.wordsBlockList = wordsBlockList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HealthCodeResult healthCodeResult = (HealthCodeResult) o;
        return Objects.equals(this.type, healthCodeResult.type) && Objects.equals(this.name, healthCodeResult.name)
            && Objects.equals(this.idcardNumber, healthCodeResult.idcardNumber)
            && Objects.equals(this.phoneNumber, healthCodeResult.phoneNumber)
            && Objects.equals(this.province, healthCodeResult.province)
            && Objects.equals(this.city, healthCodeResult.city) && Objects.equals(this.time, healthCodeResult.time)
            && Objects.equals(this.color, healthCodeResult.color)
            && Objects.equals(this.vaccinationStatus, healthCodeResult.vaccinationStatus)
            && Objects.equals(this.testInterval, healthCodeResult.testInterval)
            && Objects.equals(this.pcrTestResult, healthCodeResult.pcrTestResult)
            && Objects.equals(this.pcrTestOrganization, healthCodeResult.pcrTestOrganization)
            && Objects.equals(this.pcrTestTime, healthCodeResult.pcrTestTime)
            && Objects.equals(this.pcrSamplingTime, healthCodeResult.pcrSamplingTime)
            && Objects.equals(this.reachedCity, healthCodeResult.reachedCity)
            && Objects.equals(this.confidence, healthCodeResult.confidence)
            && Objects.equals(this.wordsBlockCount, healthCodeResult.wordsBlockCount)
            && Objects.equals(this.wordsBlockList, healthCodeResult.wordsBlockList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            name,
            idcardNumber,
            phoneNumber,
            province,
            city,
            time,
            color,
            vaccinationStatus,
            testInterval,
            pcrTestResult,
            pcrTestOrganization,
            pcrTestTime,
            pcrSamplingTime,
            reachedCity,
            confidence,
            wordsBlockCount,
            wordsBlockList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthCodeResult {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    idcardNumber: ").append(toIndentedString(idcardNumber)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    vaccinationStatus: ").append(toIndentedString(vaccinationStatus)).append("\n");
        sb.append("    testInterval: ").append(toIndentedString(testInterval)).append("\n");
        sb.append("    pcrTestResult: ").append(toIndentedString(pcrTestResult)).append("\n");
        sb.append("    pcrTestOrganization: ").append(toIndentedString(pcrTestOrganization)).append("\n");
        sb.append("    pcrTestTime: ").append(toIndentedString(pcrTestTime)).append("\n");
        sb.append("    pcrSamplingTime: ").append(toIndentedString(pcrSamplingTime)).append("\n");
        sb.append("    reachedCity: ").append(toIndentedString(reachedCity)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    wordsBlockCount: ").append(toIndentedString(wordsBlockCount)).append("\n");
        sb.append("    wordsBlockList: ").append(toIndentedString(wordsBlockList)).append("\n");
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
