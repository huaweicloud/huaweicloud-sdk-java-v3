package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TrainTicketResult
 */
public class TrainTicketResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_id")

    private String ticketId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_port")

    private String checkPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_number")

    private String trainNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "departure_station")

    private String departureStation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_station")

    private String destinationStation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "departure_station_en")

    private String departureStationEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_station_en")

    private String destinationStationEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "departure_time")

    private String departureTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seat_number")

    private String seatNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_price")

    private String ticketPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sale_method")

    private String saleMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seat_category")

    private String seatCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_changing")

    private String ticketChanging;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_number")

    private String idNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_id")

    private String logId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sale_location")

    private String saleLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Object confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_location")

    private Object textLocation;

    public TrainTicketResult withTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }

    /**
     * 火车票左上角的车票ID。 
     * @return ticketId
     */
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public TrainTicketResult withCheckPort(String checkPort) {
        this.checkPort = checkPort;
        return this;
    }

    /**
     * 检票口信息。 
     * @return checkPort
     */
    public String getCheckPort() {
        return checkPort;
    }

    public void setCheckPort(String checkPort) {
        this.checkPort = checkPort;
    }

    public TrainTicketResult withTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
        return this;
    }

    /**
     * 车次。 
     * @return trainNumber
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public TrainTicketResult withDepartureStation(String departureStation) {
        this.departureStation = departureStation;
        return this;
    }

    /**
     * 始发站。 
     * @return departureStation
     */
    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public TrainTicketResult withDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
        return this;
    }

    /**
     * 终点站。 
     * @return destinationStation
     */
    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public TrainTicketResult withDepartureStationEn(String departureStationEn) {
        this.departureStationEn = departureStationEn;
        return this;
    }

    /**
     * 始发站拼音。 
     * @return departureStationEn
     */
    public String getDepartureStationEn() {
        return departureStationEn;
    }

    public void setDepartureStationEn(String departureStationEn) {
        this.departureStationEn = departureStationEn;
    }

    public TrainTicketResult withDestinationStationEn(String destinationStationEn) {
        this.destinationStationEn = destinationStationEn;
        return this;
    }

    /**
     * 终点站拼音。 
     * @return destinationStationEn
     */
    public String getDestinationStationEn() {
        return destinationStationEn;
    }

    public void setDestinationStationEn(String destinationStationEn) {
        this.destinationStationEn = destinationStationEn;
    }

    public TrainTicketResult withDepartureTime(String departureTime) {
        this.departureTime = departureTime;
        return this;
    }

    /**
     * 开车时间。 
     * @return departureTime
     */
    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public TrainTicketResult withSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
        return this;
    }

    /**
     * 座位号。 
     * @return seatNumber
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public TrainTicketResult withTicketPrice(String ticketPrice) {
        this.ticketPrice = ticketPrice;
        return this;
    }

    /**
     * 票价。 
     * @return ticketPrice
     */
    public String getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(String ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public TrainTicketResult withSaleMethod(String saleMethod) {
        this.saleMethod = saleMethod;
        return this;
    }

    /**
     * 售票方式。 
     * @return saleMethod
     */
    public String getSaleMethod() {
        return saleMethod;
    }

    public void setSaleMethod(String saleMethod) {
        this.saleMethod = saleMethod;
    }

    public TrainTicketResult withSeatCategory(String seatCategory) {
        this.seatCategory = seatCategory;
        return this;
    }

    /**
     * 座位类别。 
     * @return seatCategory
     */
    public String getSeatCategory() {
        return seatCategory;
    }

    public void setSeatCategory(String seatCategory) {
        this.seatCategory = seatCategory;
    }

    public TrainTicketResult withTicketChanging(String ticketChanging) {
        this.ticketChanging = ticketChanging;
        return this;
    }

    /**
     * 是否改签票, \"Yes\"表示改签票，\"No\"表示非改签票。 
     * @return ticketChanging
     */
    public String getTicketChanging() {
        return ticketChanging;
    }

    public void setTicketChanging(String ticketChanging) {
        this.ticketChanging = ticketChanging;
    }

    public TrainTicketResult withIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }

    /**
     * 车票持有人的身份证号。 
     * @return idNumber
     */
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public TrainTicketResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 车票持有人姓名。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TrainTicketResult withLogId(String logId) {
        this.logId = logId;
        return this;
    }

    /**
     * 车票最下方的序列号。 
     * @return logId
     */
    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public TrainTicketResult withSaleLocation(String saleLocation) {
        this.saleLocation = saleLocation;
        return this;
    }

    /**
     * 车票售票地点。 
     * @return saleLocation
     */
    public String getSaleLocation() {
        return saleLocation;
    }

    public void setSaleLocation(String saleLocation) {
        this.saleLocation = saleLocation;
    }

    public TrainTicketResult withConfidence(Object confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 相关字段的置信度信息，置信度越大，表示本次识别的对应字段的可靠性越高，在统计意义上，置信度越大，准确率越高。 置信度由算法给出，不直接等价于对应字段的准确率。
     * @return confidence
     */
    public Object getConfidence() {
        return confidence;
    }

    public void setConfidence(Object confidence) {
        this.confidence = confidence;
    }

    public TrainTicketResult withTextLocation(Object textLocation) {
        this.textLocation = textLocation;
        return this;
    }

    /**
     * 对应所有在原图上识别到的字段位置信息，包含所有文字区域四个顶点的二维坐标（x,y）。采用图像坐标系，坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return textLocation
     */
    public Object getTextLocation() {
        return textLocation;
    }

    public void setTextLocation(Object textLocation) {
        this.textLocation = textLocation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrainTicketResult that = (TrainTicketResult) obj;
        return Objects.equals(this.ticketId, that.ticketId) && Objects.equals(this.checkPort, that.checkPort)
            && Objects.equals(this.trainNumber, that.trainNumber)
            && Objects.equals(this.departureStation, that.departureStation)
            && Objects.equals(this.destinationStation, that.destinationStation)
            && Objects.equals(this.departureStationEn, that.departureStationEn)
            && Objects.equals(this.destinationStationEn, that.destinationStationEn)
            && Objects.equals(this.departureTime, that.departureTime)
            && Objects.equals(this.seatNumber, that.seatNumber) && Objects.equals(this.ticketPrice, that.ticketPrice)
            && Objects.equals(this.saleMethod, that.saleMethod) && Objects.equals(this.seatCategory, that.seatCategory)
            && Objects.equals(this.ticketChanging, that.ticketChanging) && Objects.equals(this.idNumber, that.idNumber)
            && Objects.equals(this.name, that.name) && Objects.equals(this.logId, that.logId)
            && Objects.equals(this.saleLocation, that.saleLocation) && Objects.equals(this.confidence, that.confidence)
            && Objects.equals(this.textLocation, that.textLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketId,
            checkPort,
            trainNumber,
            departureStation,
            destinationStation,
            departureStationEn,
            destinationStationEn,
            departureTime,
            seatNumber,
            ticketPrice,
            saleMethod,
            seatCategory,
            ticketChanging,
            idNumber,
            name,
            logId,
            saleLocation,
            confidence,
            textLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrainTicketResult {\n");
        sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
        sb.append("    checkPort: ").append(toIndentedString(checkPort)).append("\n");
        sb.append("    trainNumber: ").append(toIndentedString(trainNumber)).append("\n");
        sb.append("    departureStation: ").append(toIndentedString(departureStation)).append("\n");
        sb.append("    destinationStation: ").append(toIndentedString(destinationStation)).append("\n");
        sb.append("    departureStationEn: ").append(toIndentedString(departureStationEn)).append("\n");
        sb.append("    destinationStationEn: ").append(toIndentedString(destinationStationEn)).append("\n");
        sb.append("    departureTime: ").append(toIndentedString(departureTime)).append("\n");
        sb.append("    seatNumber: ").append(toIndentedString(seatNumber)).append("\n");
        sb.append("    ticketPrice: ").append(toIndentedString(ticketPrice)).append("\n");
        sb.append("    saleMethod: ").append(toIndentedString(saleMethod)).append("\n");
        sb.append("    seatCategory: ").append(toIndentedString(seatCategory)).append("\n");
        sb.append("    ticketChanging: ").append(toIndentedString(ticketChanging)).append("\n");
        sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
        sb.append("    saleLocation: ").append(toIndentedString(saleLocation)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    textLocation: ").append(toIndentedString(textLocation)).append("\n");
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
