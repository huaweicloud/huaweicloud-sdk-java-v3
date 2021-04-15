package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.ActionDeviceAlarm;
import com.huaweicloud.sdk.iotda.v5.model.ActionDeviceCommand;
import com.huaweicloud.sdk.iotda.v5.model.ActionDisForwarding;
import com.huaweicloud.sdk.iotda.v5.model.ActionIoTAForwarding;
import com.huaweicloud.sdk.iotda.v5.model.ActionKafkaForwarding;
import com.huaweicloud.sdk.iotda.v5.model.ActionObsForwarding;
import com.huaweicloud.sdk.iotda.v5.model.ActionRomaForwarding;
import com.huaweicloud.sdk.iotda.v5.model.ActionSmnForwarding;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 规则动作结构体
 */
public class RuleAction  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="addition")
    
    private List<String> addition = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="smn_forwarding")
    
    private ActionSmnForwarding smnForwarding;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_alarm")
    
    private ActionDeviceAlarm deviceAlarm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_command")
    
    private ActionDeviceCommand deviceCommand;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dis_forwarding")
    
    private ActionDisForwarding disForwarding;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="obs_forwarding")
    
    private ActionObsForwarding obsForwarding;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roma_forwarding")
    
    private ActionRomaForwarding romaForwarding;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="iota_forwarding")
    
    private ActionIoTAForwarding iotaForwarding;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kafka_forwarding")
    
    private ActionKafkaForwarding kafkaForwarding;

    public RuleAction withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 规则动作的类型，取值范围： - DEVICE_CMD：下发设备命令消息类型。 - SMN_FORWARDING：发送SMN消息类型。 - DEVICE_ALARM：上报设备告警消息类型。当选择该类型时，condition中必须有DEVICE_DATA条件类型。该类型动作只能唯一。 - DIS_FORWARDING：转发DIS服务消息类型。 - OBS_FORWARDING：转发OBS服务消息类型。 - ROMA_FORWARDING：转发ROMA Connect服务消息类型。 - IoTA_FORWARDING：转发IoTA服务消息类型。 - KAFKA_FORWARDING：转发kafka消息类型。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public RuleAction withAddition(List<String> addition) {
        this.addition = addition;
        return this;
    }

    
    public RuleAction addAdditionItem(String additionItem) {
        if(this.addition == null) {
            this.addition = new ArrayList<>();
        }
        this.addition.add(additionItem);
        return this;
    }

    public RuleAction withAddition(Consumer<List<String>> additionSetter) {
        if(this.addition == null) {
            this.addition = new ArrayList<>();
        }
        additionSetter.accept(this.addition);
        return this;
    }

    /**
     * 附加信息，在默认规则执行结果中附加额外内容，仅设备属性和消息类型数据转发规则支持，取值范围：PRODUCT_ID
     * @return addition
     */
    public List<String> getAddition() {
        return addition;
    }

    public void setAddition(List<String> addition) {
        this.addition = addition;
    }

    

    public RuleAction withSmnForwarding(ActionSmnForwarding smnForwarding) {
        this.smnForwarding = smnForwarding;
        return this;
    }

    public RuleAction withSmnForwarding(Consumer<ActionSmnForwarding> smnForwardingSetter) {
        if(this.smnForwarding == null ){
            this.smnForwarding = new ActionSmnForwarding();
            smnForwardingSetter.accept(this.smnForwarding);
        }
        
        return this;
    }


    /**
     * Get smnForwarding
     * @return smnForwarding
     */
    public ActionSmnForwarding getSmnForwarding() {
        return smnForwarding;
    }

    public void setSmnForwarding(ActionSmnForwarding smnForwarding) {
        this.smnForwarding = smnForwarding;
    }

    

    public RuleAction withDeviceAlarm(ActionDeviceAlarm deviceAlarm) {
        this.deviceAlarm = deviceAlarm;
        return this;
    }

    public RuleAction withDeviceAlarm(Consumer<ActionDeviceAlarm> deviceAlarmSetter) {
        if(this.deviceAlarm == null ){
            this.deviceAlarm = new ActionDeviceAlarm();
            deviceAlarmSetter.accept(this.deviceAlarm);
        }
        
        return this;
    }


    /**
     * Get deviceAlarm
     * @return deviceAlarm
     */
    public ActionDeviceAlarm getDeviceAlarm() {
        return deviceAlarm;
    }

    public void setDeviceAlarm(ActionDeviceAlarm deviceAlarm) {
        this.deviceAlarm = deviceAlarm;
    }

    

    public RuleAction withDeviceCommand(ActionDeviceCommand deviceCommand) {
        this.deviceCommand = deviceCommand;
        return this;
    }

    public RuleAction withDeviceCommand(Consumer<ActionDeviceCommand> deviceCommandSetter) {
        if(this.deviceCommand == null ){
            this.deviceCommand = new ActionDeviceCommand();
            deviceCommandSetter.accept(this.deviceCommand);
        }
        
        return this;
    }


    /**
     * Get deviceCommand
     * @return deviceCommand
     */
    public ActionDeviceCommand getDeviceCommand() {
        return deviceCommand;
    }

    public void setDeviceCommand(ActionDeviceCommand deviceCommand) {
        this.deviceCommand = deviceCommand;
    }

    

    public RuleAction withDisForwarding(ActionDisForwarding disForwarding) {
        this.disForwarding = disForwarding;
        return this;
    }

    public RuleAction withDisForwarding(Consumer<ActionDisForwarding> disForwardingSetter) {
        if(this.disForwarding == null ){
            this.disForwarding = new ActionDisForwarding();
            disForwardingSetter.accept(this.disForwarding);
        }
        
        return this;
    }


    /**
     * Get disForwarding
     * @return disForwarding
     */
    public ActionDisForwarding getDisForwarding() {
        return disForwarding;
    }

    public void setDisForwarding(ActionDisForwarding disForwarding) {
        this.disForwarding = disForwarding;
    }

    

    public RuleAction withObsForwarding(ActionObsForwarding obsForwarding) {
        this.obsForwarding = obsForwarding;
        return this;
    }

    public RuleAction withObsForwarding(Consumer<ActionObsForwarding> obsForwardingSetter) {
        if(this.obsForwarding == null ){
            this.obsForwarding = new ActionObsForwarding();
            obsForwardingSetter.accept(this.obsForwarding);
        }
        
        return this;
    }


    /**
     * Get obsForwarding
     * @return obsForwarding
     */
    public ActionObsForwarding getObsForwarding() {
        return obsForwarding;
    }

    public void setObsForwarding(ActionObsForwarding obsForwarding) {
        this.obsForwarding = obsForwarding;
    }

    

    public RuleAction withRomaForwarding(ActionRomaForwarding romaForwarding) {
        this.romaForwarding = romaForwarding;
        return this;
    }

    public RuleAction withRomaForwarding(Consumer<ActionRomaForwarding> romaForwardingSetter) {
        if(this.romaForwarding == null ){
            this.romaForwarding = new ActionRomaForwarding();
            romaForwardingSetter.accept(this.romaForwarding);
        }
        
        return this;
    }


    /**
     * Get romaForwarding
     * @return romaForwarding
     */
    public ActionRomaForwarding getRomaForwarding() {
        return romaForwarding;
    }

    public void setRomaForwarding(ActionRomaForwarding romaForwarding) {
        this.romaForwarding = romaForwarding;
    }

    

    public RuleAction withIotaForwarding(ActionIoTAForwarding iotaForwarding) {
        this.iotaForwarding = iotaForwarding;
        return this;
    }

    public RuleAction withIotaForwarding(Consumer<ActionIoTAForwarding> iotaForwardingSetter) {
        if(this.iotaForwarding == null ){
            this.iotaForwarding = new ActionIoTAForwarding();
            iotaForwardingSetter.accept(this.iotaForwarding);
        }
        
        return this;
    }


    /**
     * Get iotaForwarding
     * @return iotaForwarding
     */
    public ActionIoTAForwarding getIotaForwarding() {
        return iotaForwarding;
    }

    public void setIotaForwarding(ActionIoTAForwarding iotaForwarding) {
        this.iotaForwarding = iotaForwarding;
    }

    

    public RuleAction withKafkaForwarding(ActionKafkaForwarding kafkaForwarding) {
        this.kafkaForwarding = kafkaForwarding;
        return this;
    }

    public RuleAction withKafkaForwarding(Consumer<ActionKafkaForwarding> kafkaForwardingSetter) {
        if(this.kafkaForwarding == null ){
            this.kafkaForwarding = new ActionKafkaForwarding();
            kafkaForwardingSetter.accept(this.kafkaForwarding);
        }
        
        return this;
    }


    /**
     * Get kafkaForwarding
     * @return kafkaForwarding
     */
    public ActionKafkaForwarding getKafkaForwarding() {
        return kafkaForwarding;
    }

    public void setKafkaForwarding(ActionKafkaForwarding kafkaForwarding) {
        this.kafkaForwarding = kafkaForwarding;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleAction ruleAction = (RuleAction) o;
        return Objects.equals(this.type, ruleAction.type) &&
            Objects.equals(this.addition, ruleAction.addition) &&
            Objects.equals(this.smnForwarding, ruleAction.smnForwarding) &&
            Objects.equals(this.deviceAlarm, ruleAction.deviceAlarm) &&
            Objects.equals(this.deviceCommand, ruleAction.deviceCommand) &&
            Objects.equals(this.disForwarding, ruleAction.disForwarding) &&
            Objects.equals(this.obsForwarding, ruleAction.obsForwarding) &&
            Objects.equals(this.romaForwarding, ruleAction.romaForwarding) &&
            Objects.equals(this.iotaForwarding, ruleAction.iotaForwarding) &&
            Objects.equals(this.kafkaForwarding, ruleAction.kafkaForwarding);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, addition, smnForwarding, deviceAlarm, deviceCommand, disForwarding, obsForwarding, romaForwarding, iotaForwarding, kafkaForwarding);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleAction {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    addition: ").append(toIndentedString(addition)).append("\n");
        sb.append("    smnForwarding: ").append(toIndentedString(smnForwarding)).append("\n");
        sb.append("    deviceAlarm: ").append(toIndentedString(deviceAlarm)).append("\n");
        sb.append("    deviceCommand: ").append(toIndentedString(deviceCommand)).append("\n");
        sb.append("    disForwarding: ").append(toIndentedString(disForwarding)).append("\n");
        sb.append("    obsForwarding: ").append(toIndentedString(obsForwarding)).append("\n");
        sb.append("    romaForwarding: ").append(toIndentedString(romaForwarding)).append("\n");
        sb.append("    iotaForwarding: ").append(toIndentedString(iotaForwarding)).append("\n");
        sb.append("    kafkaForwarding: ").append(toIndentedString(kafkaForwarding)).append("\n");
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

