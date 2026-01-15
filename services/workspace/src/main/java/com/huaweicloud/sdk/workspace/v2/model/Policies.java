package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 策略类。
 */
public class Policies {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peripherals")

    private PoliciesPeripherals peripherals;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio")

    private PoliciesAudio audio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client")

    private PoliciesClient client;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display")

    private PoliciesDisplay display;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_and_clipboard")

    private PoliciesFileAndClipboard fileAndClipboard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session")

    private Session session;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_channel")

    private VirtualChannel virtualChannel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watermark")

    private Watermark watermark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyboard_mouse")

    private PoliciesKeyboardMouse keyboardMouse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seamless")

    private PoliciesSeamless seamless;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "personalized_data_mgmt")

    private PoliciesPersonalizedDataMgmt personalizedDataMgmt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom")

    private PoliciesCustom custom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_audit")

    private PoliciesRecordAudit recordAudit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_storage")

    private PoliciesCloudStorage cloudStorage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_profile")

    private PoliciesUserProfile userProfile;

    public Policies withPeripherals(PoliciesPeripherals peripherals) {
        this.peripherals = peripherals;
        return this;
    }

    public Policies withPeripherals(Consumer<PoliciesPeripherals> peripheralsSetter) {
        if (this.peripherals == null) {
            this.peripherals = new PoliciesPeripherals();
            peripheralsSetter.accept(this.peripherals);
        }

        return this;
    }

    /**
     * Get peripherals
     * @return peripherals
     */
    public PoliciesPeripherals getPeripherals() {
        return peripherals;
    }

    public void setPeripherals(PoliciesPeripherals peripherals) {
        this.peripherals = peripherals;
    }

    public Policies withAudio(PoliciesAudio audio) {
        this.audio = audio;
        return this;
    }

    public Policies withAudio(Consumer<PoliciesAudio> audioSetter) {
        if (this.audio == null) {
            this.audio = new PoliciesAudio();
            audioSetter.accept(this.audio);
        }

        return this;
    }

    /**
     * Get audio
     * @return audio
     */
    public PoliciesAudio getAudio() {
        return audio;
    }

    public void setAudio(PoliciesAudio audio) {
        this.audio = audio;
    }

    public Policies withClient(PoliciesClient client) {
        this.client = client;
        return this;
    }

    public Policies withClient(Consumer<PoliciesClient> clientSetter) {
        if (this.client == null) {
            this.client = new PoliciesClient();
            clientSetter.accept(this.client);
        }

        return this;
    }

    /**
     * Get client
     * @return client
     */
    public PoliciesClient getClient() {
        return client;
    }

    public void setClient(PoliciesClient client) {
        this.client = client;
    }

    public Policies withDisplay(PoliciesDisplay display) {
        this.display = display;
        return this;
    }

    public Policies withDisplay(Consumer<PoliciesDisplay> displaySetter) {
        if (this.display == null) {
            this.display = new PoliciesDisplay();
            displaySetter.accept(this.display);
        }

        return this;
    }

    /**
     * Get display
     * @return display
     */
    public PoliciesDisplay getDisplay() {
        return display;
    }

    public void setDisplay(PoliciesDisplay display) {
        this.display = display;
    }

    public Policies withFileAndClipboard(PoliciesFileAndClipboard fileAndClipboard) {
        this.fileAndClipboard = fileAndClipboard;
        return this;
    }

    public Policies withFileAndClipboard(Consumer<PoliciesFileAndClipboard> fileAndClipboardSetter) {
        if (this.fileAndClipboard == null) {
            this.fileAndClipboard = new PoliciesFileAndClipboard();
            fileAndClipboardSetter.accept(this.fileAndClipboard);
        }

        return this;
    }

    /**
     * Get fileAndClipboard
     * @return fileAndClipboard
     */
    public PoliciesFileAndClipboard getFileAndClipboard() {
        return fileAndClipboard;
    }

    public void setFileAndClipboard(PoliciesFileAndClipboard fileAndClipboard) {
        this.fileAndClipboard = fileAndClipboard;
    }

    public Policies withSession(Session session) {
        this.session = session;
        return this;
    }

    public Policies withSession(Consumer<Session> sessionSetter) {
        if (this.session == null) {
            this.session = new Session();
            sessionSetter.accept(this.session);
        }

        return this;
    }

    /**
     * Get session
     * @return session
     */
    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Policies withVirtualChannel(VirtualChannel virtualChannel) {
        this.virtualChannel = virtualChannel;
        return this;
    }

    public Policies withVirtualChannel(Consumer<VirtualChannel> virtualChannelSetter) {
        if (this.virtualChannel == null) {
            this.virtualChannel = new VirtualChannel();
            virtualChannelSetter.accept(this.virtualChannel);
        }

        return this;
    }

    /**
     * Get virtualChannel
     * @return virtualChannel
     */
    public VirtualChannel getVirtualChannel() {
        return virtualChannel;
    }

    public void setVirtualChannel(VirtualChannel virtualChannel) {
        this.virtualChannel = virtualChannel;
    }

    public Policies withWatermark(Watermark watermark) {
        this.watermark = watermark;
        return this;
    }

    public Policies withWatermark(Consumer<Watermark> watermarkSetter) {
        if (this.watermark == null) {
            this.watermark = new Watermark();
            watermarkSetter.accept(this.watermark);
        }

        return this;
    }

    /**
     * Get watermark
     * @return watermark
     */
    public Watermark getWatermark() {
        return watermark;
    }

    public void setWatermark(Watermark watermark) {
        this.watermark = watermark;
    }

    public Policies withKeyboardMouse(PoliciesKeyboardMouse keyboardMouse) {
        this.keyboardMouse = keyboardMouse;
        return this;
    }

    public Policies withKeyboardMouse(Consumer<PoliciesKeyboardMouse> keyboardMouseSetter) {
        if (this.keyboardMouse == null) {
            this.keyboardMouse = new PoliciesKeyboardMouse();
            keyboardMouseSetter.accept(this.keyboardMouse);
        }

        return this;
    }

    /**
     * Get keyboardMouse
     * @return keyboardMouse
     */
    public PoliciesKeyboardMouse getKeyboardMouse() {
        return keyboardMouse;
    }

    public void setKeyboardMouse(PoliciesKeyboardMouse keyboardMouse) {
        this.keyboardMouse = keyboardMouse;
    }

    public Policies withSeamless(PoliciesSeamless seamless) {
        this.seamless = seamless;
        return this;
    }

    public Policies withSeamless(Consumer<PoliciesSeamless> seamlessSetter) {
        if (this.seamless == null) {
            this.seamless = new PoliciesSeamless();
            seamlessSetter.accept(this.seamless);
        }

        return this;
    }

    /**
     * Get seamless
     * @return seamless
     */
    public PoliciesSeamless getSeamless() {
        return seamless;
    }

    public void setSeamless(PoliciesSeamless seamless) {
        this.seamless = seamless;
    }

    public Policies withPersonalizedDataMgmt(PoliciesPersonalizedDataMgmt personalizedDataMgmt) {
        this.personalizedDataMgmt = personalizedDataMgmt;
        return this;
    }

    public Policies withPersonalizedDataMgmt(Consumer<PoliciesPersonalizedDataMgmt> personalizedDataMgmtSetter) {
        if (this.personalizedDataMgmt == null) {
            this.personalizedDataMgmt = new PoliciesPersonalizedDataMgmt();
            personalizedDataMgmtSetter.accept(this.personalizedDataMgmt);
        }

        return this;
    }

    /**
     * Get personalizedDataMgmt
     * @return personalizedDataMgmt
     */
    public PoliciesPersonalizedDataMgmt getPersonalizedDataMgmt() {
        return personalizedDataMgmt;
    }

    public void setPersonalizedDataMgmt(PoliciesPersonalizedDataMgmt personalizedDataMgmt) {
        this.personalizedDataMgmt = personalizedDataMgmt;
    }

    public Policies withCustom(PoliciesCustom custom) {
        this.custom = custom;
        return this;
    }

    public Policies withCustom(Consumer<PoliciesCustom> customSetter) {
        if (this.custom == null) {
            this.custom = new PoliciesCustom();
            customSetter.accept(this.custom);
        }

        return this;
    }

    /**
     * Get custom
     * @return custom
     */
    public PoliciesCustom getCustom() {
        return custom;
    }

    public void setCustom(PoliciesCustom custom) {
        this.custom = custom;
    }

    public Policies withRecordAudit(PoliciesRecordAudit recordAudit) {
        this.recordAudit = recordAudit;
        return this;
    }

    public Policies withRecordAudit(Consumer<PoliciesRecordAudit> recordAuditSetter) {
        if (this.recordAudit == null) {
            this.recordAudit = new PoliciesRecordAudit();
            recordAuditSetter.accept(this.recordAudit);
        }

        return this;
    }

    /**
     * Get recordAudit
     * @return recordAudit
     */
    public PoliciesRecordAudit getRecordAudit() {
        return recordAudit;
    }

    public void setRecordAudit(PoliciesRecordAudit recordAudit) {
        this.recordAudit = recordAudit;
    }

    public Policies withCloudStorage(PoliciesCloudStorage cloudStorage) {
        this.cloudStorage = cloudStorage;
        return this;
    }

    public Policies withCloudStorage(Consumer<PoliciesCloudStorage> cloudStorageSetter) {
        if (this.cloudStorage == null) {
            this.cloudStorage = new PoliciesCloudStorage();
            cloudStorageSetter.accept(this.cloudStorage);
        }

        return this;
    }

    /**
     * Get cloudStorage
     * @return cloudStorage
     */
    public PoliciesCloudStorage getCloudStorage() {
        return cloudStorage;
    }

    public void setCloudStorage(PoliciesCloudStorage cloudStorage) {
        this.cloudStorage = cloudStorage;
    }

    public Policies withUserProfile(PoliciesUserProfile userProfile) {
        this.userProfile = userProfile;
        return this;
    }

    public Policies withUserProfile(Consumer<PoliciesUserProfile> userProfileSetter) {
        if (this.userProfile == null) {
            this.userProfile = new PoliciesUserProfile();
            userProfileSetter.accept(this.userProfile);
        }

        return this;
    }

    /**
     * Get userProfile
     * @return userProfile
     */
    public PoliciesUserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(PoliciesUserProfile userProfile) {
        this.userProfile = userProfile;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Policies that = (Policies) obj;
        return Objects.equals(this.peripherals, that.peripherals) && Objects.equals(this.audio, that.audio)
            && Objects.equals(this.client, that.client) && Objects.equals(this.display, that.display)
            && Objects.equals(this.fileAndClipboard, that.fileAndClipboard)
            && Objects.equals(this.session, that.session) && Objects.equals(this.virtualChannel, that.virtualChannel)
            && Objects.equals(this.watermark, that.watermark) && Objects.equals(this.keyboardMouse, that.keyboardMouse)
            && Objects.equals(this.seamless, that.seamless)
            && Objects.equals(this.personalizedDataMgmt, that.personalizedDataMgmt)
            && Objects.equals(this.custom, that.custom) && Objects.equals(this.recordAudit, that.recordAudit)
            && Objects.equals(this.cloudStorage, that.cloudStorage)
            && Objects.equals(this.userProfile, that.userProfile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peripherals,
            audio,
            client,
            display,
            fileAndClipboard,
            session,
            virtualChannel,
            watermark,
            keyboardMouse,
            seamless,
            personalizedDataMgmt,
            custom,
            recordAudit,
            cloudStorage,
            userProfile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Policies {\n");
        sb.append("    peripherals: ").append(toIndentedString(peripherals)).append("\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
        sb.append("    client: ").append(toIndentedString(client)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    fileAndClipboard: ").append(toIndentedString(fileAndClipboard)).append("\n");
        sb.append("    session: ").append(toIndentedString(session)).append("\n");
        sb.append("    virtualChannel: ").append(toIndentedString(virtualChannel)).append("\n");
        sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
        sb.append("    keyboardMouse: ").append(toIndentedString(keyboardMouse)).append("\n");
        sb.append("    seamless: ").append(toIndentedString(seamless)).append("\n");
        sb.append("    personalizedDataMgmt: ").append(toIndentedString(personalizedDataMgmt)).append("\n");
        sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
        sb.append("    recordAudit: ").append(toIndentedString(recordAudit)).append("\n");
        sb.append("    cloudStorage: ").append(toIndentedString(cloudStorage)).append("\n");
        sb.append("    userProfile: ").append(toIndentedString(userProfile)).append("\n");
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
