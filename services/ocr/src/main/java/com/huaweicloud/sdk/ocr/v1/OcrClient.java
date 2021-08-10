package com.huaweicloud.sdk.ocr.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.ocr.v1.model.*;

public class OcrClient {

    protected HcClient hcClient;

    public OcrClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OcrClient> newBuilder() {
        return new ClientBuilder<>(OcrClient::new, "BasicCredentials");
    }

    /** 智能分类识别 检测定位图片上指定要识别的票证（票据、证件或其他文字载体），并对其进行结构化识别。接口以列表形式返回图片上要识别票证的位置坐标、结构化识别的内容以及对应的类别。 计费次数说明：
     * 只对识别成功的票证进行计费，识别失败的票证不计费。例如图片中包含三张票证，有两张识别成功，一张识别失败，此时接口计费两次。
     *
     * @param RecognizeAutoClassificationRequest 请求对象
     * @return RecognizeAutoClassificationResponse */
    public RecognizeAutoClassificationResponse recognizeAutoClassification(RecognizeAutoClassificationRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeAutoClassification);
    }

    /** 智能分类识别 检测定位图片上指定要识别的票证（票据、证件或其他文字载体），并对其进行结构化识别。接口以列表形式返回图片上要识别票证的位置坐标、结构化识别的内容以及对应的类别。 计费次数说明：
     * 只对识别成功的票证进行计费，识别失败的票证不计费。例如图片中包含三张票证，有两张识别成功，一张识别失败，此时接口计费两次。
     *
     * @param RecognizeAutoClassificationRequest 请求对象
     * @return SyncInvoker<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse> */
    public SyncInvoker<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse> recognizeAutoClassificationInvoker(
        RecognizeAutoClassificationRequest request) {
        return new SyncInvoker<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse>(request,
            OcrMeta.recognizeAutoClassification, hcClient);
    }

    /** 银行卡识别 识别银行卡上的关键文字信息，并返回识别的结构化结果。 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     *
     * @param RecognizeBankcardRequest 请求对象
     * @return RecognizeBankcardResponse */
    public RecognizeBankcardResponse recognizeBankcard(RecognizeBankcardRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeBankcard);
    }

    /** 银行卡识别 识别银行卡上的关键文字信息，并返回识别的结构化结果。 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     *
     * @param RecognizeBankcardRequest 请求对象
     * @return SyncInvoker<RecognizeBankcardRequest, RecognizeBankcardResponse> */
    public SyncInvoker<RecognizeBankcardRequest, RecognizeBankcardResponse> recognizeBankcardInvoker(
        RecognizeBankcardRequest request) {
        return new SyncInvoker<RecognizeBankcardRequest, RecognizeBankcardResponse>(request, OcrMeta.recognizeBankcard,
            hcClient);
    }

    /** 名片识别 识别名片图片上的文字信息，并返回识别的结构化结果。支持对多种不同版式名片进行结构化信息提取。
     *
     * @param RecognizeBusinessCardRequest 请求对象
     * @return RecognizeBusinessCardResponse */
    public RecognizeBusinessCardResponse recognizeBusinessCard(RecognizeBusinessCardRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeBusinessCard);
    }

    /** 名片识别 识别名片图片上的文字信息，并返回识别的结构化结果。支持对多种不同版式名片进行结构化信息提取。
     *
     * @param RecognizeBusinessCardRequest 请求对象
     * @return SyncInvoker<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse> */
    public SyncInvoker<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse> recognizeBusinessCardInvoker(
        RecognizeBusinessCardRequest request) {
        return new SyncInvoker<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse>(request,
            OcrMeta.recognizeBusinessCard, hcClient);
    }

    /** 营业执照识别 识别营业执照首页图片中的文字信息，并返回识别的结构化结果。 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     *
     * @param RecognizeBusinessLicenseRequest 请求对象
     * @return RecognizeBusinessLicenseResponse */
    public RecognizeBusinessLicenseResponse recognizeBusinessLicense(RecognizeBusinessLicenseRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeBusinessLicense);
    }

    /** 营业执照识别 识别营业执照首页图片中的文字信息，并返回识别的结构化结果。 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     *
     * @param RecognizeBusinessLicenseRequest 请求对象
     * @return SyncInvoker<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse> */
    public SyncInvoker<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse> recognizeBusinessLicenseInvoker(
        RecognizeBusinessLicenseRequest request) {
        return new SyncInvoker<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse>(request,
            OcrMeta.recognizeBusinessLicense, hcClient);
    }

    /** 驾驶证识别 识别用户上传的驾驶证图片（或者用户提供的华为云上OBS的驾驶证图片文件的URL）中主页与副页的文字内容，并将识别的结果返回给用户。 说明： 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     *
     * @param RecognizeDriverLicenseRequest 请求对象
     * @return RecognizeDriverLicenseResponse */
    public RecognizeDriverLicenseResponse recognizeDriverLicense(RecognizeDriverLicenseRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeDriverLicense);
    }

    /** 驾驶证识别 识别用户上传的驾驶证图片（或者用户提供的华为云上OBS的驾驶证图片文件的URL）中主页与副页的文字内容，并将识别的结果返回给用户。 说明： 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     *
     * @param RecognizeDriverLicenseRequest 请求对象
     * @return SyncInvoker<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse> */
    public SyncInvoker<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse> recognizeDriverLicenseInvoker(
        RecognizeDriverLicenseRequest request) {
        return new SyncInvoker<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse>(request,
            OcrMeta.recognizeDriverLicense, hcClient);
    }

    /** 飞机行程单识别 识别飞机行程单中的文字信息，并返回识别的结构化结果。 说明： 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     *
     * @param RecognizeFlightItineraryRequest 请求对象
     * @return RecognizeFlightItineraryResponse */
    public RecognizeFlightItineraryResponse recognizeFlightItinerary(RecognizeFlightItineraryRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeFlightItinerary);
    }

    /** 飞机行程单识别 识别飞机行程单中的文字信息，并返回识别的结构化结果。 说明： 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     *
     * @param RecognizeFlightItineraryRequest 请求对象
     * @return SyncInvoker<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse> */
    public SyncInvoker<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse> recognizeFlightItineraryInvoker(
        RecognizeFlightItineraryRequest request) {
        return new SyncInvoker<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse>(request,
            OcrMeta.recognizeFlightItinerary, hcClient);
    }

    /** 通用表格识别 识别用于识别用户上传的通用表格图片（或者用户提供的华为云上OBS的通用表格图片文件的URL）中的文字内容，并将识别的结果返回给用户。
     *
     * @param RecognizeGeneralTableRequest 请求对象
     * @return RecognizeGeneralTableResponse */
    public RecognizeGeneralTableResponse recognizeGeneralTable(RecognizeGeneralTableRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeGeneralTable);
    }

    /** 通用表格识别 识别用于识别用户上传的通用表格图片（或者用户提供的华为云上OBS的通用表格图片文件的URL）中的文字内容，并将识别的结果返回给用户。
     *
     * @param RecognizeGeneralTableRequest 请求对象
     * @return SyncInvoker<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse> */
    public SyncInvoker<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse> recognizeGeneralTableInvoker(
        RecognizeGeneralTableRequest request) {
        return new SyncInvoker<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse>(request,
            OcrMeta.recognizeGeneralTable, hcClient);
    }

    /** 通用文字识别 识别图片上的文字信息，返回识别的文字和坐标。支持扫描文件、电子文档、书籍、票据和表单等多种场景的文字识别。
     *
     * @param RecognizeGeneralTextRequest 请求对象
     * @return RecognizeGeneralTextResponse */
    public RecognizeGeneralTextResponse recognizeGeneralText(RecognizeGeneralTextRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeGeneralText);
    }

    /** 通用文字识别 识别图片上的文字信息，返回识别的文字和坐标。支持扫描文件、电子文档、书籍、票据和表单等多种场景的文字识别。
     *
     * @param RecognizeGeneralTextRequest 请求对象
     * @return SyncInvoker<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse> */
    public SyncInvoker<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse> recognizeGeneralTextInvoker(
        RecognizeGeneralTextRequest request) {
        return new SyncInvoker<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse>(request,
            OcrMeta.recognizeGeneralText, hcClient);
    }

    /** 手写文字识别 识别文档中的手写文字信息，并将识别的结构化结果返回给用户。
     *
     * @param RecognizeHandwritingRequest 请求对象
     * @return RecognizeHandwritingResponse */
    public RecognizeHandwritingResponse recognizeHandwriting(RecognizeHandwritingRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeHandwriting);
    }

    /** 手写文字识别 识别文档中的手写文字信息，并将识别的结构化结果返回给用户。
     *
     * @param RecognizeHandwritingRequest 请求对象
     * @return SyncInvoker<RecognizeHandwritingRequest, RecognizeHandwritingResponse> */
    public SyncInvoker<RecognizeHandwritingRequest, RecognizeHandwritingResponse> recognizeHandwritingInvoker(
        RecognizeHandwritingRequest request) {
        return new SyncInvoker<RecognizeHandwritingRequest, RecognizeHandwritingResponse>(request,
            OcrMeta.recognizeHandwriting, hcClient);
    }

    /** 身份证识别 识别身份证图片中的文字内容，并将识别的结果返回给用户。 说明： 身份证识别只支持中国大陆汉族身份证识别。
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     *
     * @param RecognizeIdCardRequest 请求对象
     * @return RecognizeIdCardResponse */
    public RecognizeIdCardResponse recognizeIdCard(RecognizeIdCardRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeIdCard);
    }

    /** 身份证识别 识别身份证图片中的文字内容，并将识别的结果返回给用户。 说明： 身份证识别只支持中国大陆汉族身份证识别。
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     *
     * @param RecognizeIdCardRequest 请求对象
     * @return SyncInvoker<RecognizeIdCardRequest, RecognizeIdCardResponse> */
    public SyncInvoker<RecognizeIdCardRequest, RecognizeIdCardResponse> recognizeIdCardInvoker(
        RecognizeIdCardRequest request) {
        return new SyncInvoker<RecognizeIdCardRequest, RecognizeIdCardResponse>(request, OcrMeta.recognizeIdCard,
            hcClient);
    }

    /** 车牌识别 识别输入图片中的车牌信息，并返回其坐标和内容。
     *
     * @param RecognizeLicensePlateRequest 请求对象
     * @return RecognizeLicensePlateResponse */
    public RecognizeLicensePlateResponse recognizeLicensePlate(RecognizeLicensePlateRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeLicensePlate);
    }

    /** 车牌识别 识别输入图片中的车牌信息，并返回其坐标和内容。
     *
     * @param RecognizeLicensePlateRequest 请求对象
     * @return SyncInvoker<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse> */
    public SyncInvoker<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse> recognizeLicensePlateInvoker(
        RecognizeLicensePlateRequest request) {
        return new SyncInvoker<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse>(request,
            OcrMeta.recognizeLicensePlate, hcClient);
    }

    /** 机动车销售发票识别 识别机动车销售发票图片中的文字内容，并将识别的结果返回给用户。 说明： 该增值税发票仅限于中华人民共和国境内使用的增值税发票。
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     *
     * @param RecognizeMvsInvoiceRequest 请求对象
     * @return RecognizeMvsInvoiceResponse */
    public RecognizeMvsInvoiceResponse recognizeMvsInvoice(RecognizeMvsInvoiceRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeMvsInvoice);
    }

    /** 机动车销售发票识别 识别机动车销售发票图片中的文字内容，并将识别的结果返回给用户。 说明： 该增值税发票仅限于中华人民共和国境内使用的增值税发票。
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     *
     * @param RecognizeMvsInvoiceRequest 请求对象
     * @return SyncInvoker<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse> */
    public SyncInvoker<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse> recognizeMvsInvoiceInvoker(
        RecognizeMvsInvoiceRequest request) {
        return new SyncInvoker<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse>(request,
            OcrMeta.recognizeMvsInvoice, hcClient);
    }

    /** 护照识别 识别用户上传的护照首页图片中的文字信息，并返回识别的结构化结果。当前版本支持中国护照的全字段识别。外国护照支持护照下方两行国际标准化的机读码识别，并可从中提取6-7个关键字段信息。 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     *
     * @param RecognizePassportRequest 请求对象
     * @return RecognizePassportResponse */
    public RecognizePassportResponse recognizePassport(RecognizePassportRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizePassport);
    }

    /** 护照识别 识别用户上传的护照首页图片中的文字信息，并返回识别的结构化结果。当前版本支持中国护照的全字段识别。外国护照支持护照下方两行国际标准化的机读码识别，并可从中提取6-7个关键字段信息。 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     *
     * @param RecognizePassportRequest 请求对象
     * @return SyncInvoker<RecognizePassportRequest, RecognizePassportResponse> */
    public SyncInvoker<RecognizePassportRequest, RecognizePassportResponse> recognizePassportInvoker(
        RecognizePassportRequest request) {
        return new SyncInvoker<RecognizePassportRequest, RecognizePassportResponse>(request, OcrMeta.recognizePassport,
            hcClient);
    }

    /** 定额发票识别 识别定额发票中的文字信息，并返回识别的结构化结果。 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     *
     * @param RecognizeQuotaInvoiceRequest 请求对象
     * @return RecognizeQuotaInvoiceResponse */
    public RecognizeQuotaInvoiceResponse recognizeQuotaInvoice(RecognizeQuotaInvoiceRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeQuotaInvoice);
    }

    /** 定额发票识别 识别定额发票中的文字信息，并返回识别的结构化结果。 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     *
     * @param RecognizeQuotaInvoiceRequest 请求对象
     * @return SyncInvoker<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse> */
    public SyncInvoker<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse> recognizeQuotaInvoiceInvoker(
        RecognizeQuotaInvoiceRequest request) {
        return new SyncInvoker<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse>(request,
            OcrMeta.recognizeQuotaInvoice, hcClient);
    }

    /** 出租车发票识别 识别出租车发票中的文字信息，并返回识别的结构化结果。 说明： 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     *
     * @param RecognizeTaxiInvoiceRequest 请求对象
     * @return RecognizeTaxiInvoiceResponse */
    public RecognizeTaxiInvoiceResponse recognizeTaxiInvoice(RecognizeTaxiInvoiceRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeTaxiInvoice);
    }

    /** 出租车发票识别 识别出租车发票中的文字信息，并返回识别的结构化结果。 说明： 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     *
     * @param RecognizeTaxiInvoiceRequest 请求对象
     * @return SyncInvoker<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse> */
    public SyncInvoker<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse> recognizeTaxiInvoiceInvoker(
        RecognizeTaxiInvoiceRequest request) {
        return new SyncInvoker<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse>(request,
            OcrMeta.recognizeTaxiInvoice, hcClient);
    }

    /** 车辆通行费发票识别 识别车辆通行费发票中的文字信息，并返回识别的结构化结果。 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     *
     * @param RecognizeTollInvoiceRequest 请求对象
     * @return RecognizeTollInvoiceResponse */
    public RecognizeTollInvoiceResponse recognizeTollInvoice(RecognizeTollInvoiceRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeTollInvoice);
    }

    /** 车辆通行费发票识别 识别车辆通行费发票中的文字信息，并返回识别的结构化结果。 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     *
     * @param RecognizeTollInvoiceRequest 请求对象
     * @return SyncInvoker<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse> */
    public SyncInvoker<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse> recognizeTollInvoiceInvoker(
        RecognizeTollInvoiceRequest request) {
        return new SyncInvoker<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse>(request,
            OcrMeta.recognizeTollInvoice, hcClient);
    }

    /** 火车票识别 识别火车票中的文字信息，并返回识别的结构化结果。 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     *
     * @param RecognizeTrainTicketRequest 请求对象
     * @return RecognizeTrainTicketResponse */
    public RecognizeTrainTicketResponse recognizeTrainTicket(RecognizeTrainTicketRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeTrainTicket);
    }

    /** 火车票识别 识别火车票中的文字信息，并返回识别的结构化结果。 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     *
     * @param RecognizeTrainTicketRequest 请求对象
     * @return SyncInvoker<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse> */
    public SyncInvoker<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse> recognizeTrainTicketInvoker(
        RecognizeTrainTicketRequest request) {
        return new SyncInvoker<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse>(request,
            OcrMeta.recognizeTrainTicket, hcClient);
    }

    /** 道路运输证识别 识别道路运输证首页中的文字信息，并返回识别的结构化结果。 说明： 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     *
     * @param RecognizeTransportationLicenseRequest 请求对象
     * @return RecognizeTransportationLicenseResponse */
    public RecognizeTransportationLicenseResponse recognizeTransportationLicense(
        RecognizeTransportationLicenseRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeTransportationLicense);
    }

    /** 道路运输证识别 识别道路运输证首页中的文字信息，并返回识别的结构化结果。 说明： 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     *
     * @param RecognizeTransportationLicenseRequest 请求对象
     * @return SyncInvoker<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse> */
    public SyncInvoker<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse> recognizeTransportationLicenseInvoker(
        RecognizeTransportationLicenseRequest request) {
        return new SyncInvoker<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse>(request,
            OcrMeta.recognizeTransportationLicense, hcClient);
    }

    /** 增值税发票识别 识别用户上传的增值税发票图片（或者用户提供的华为云上OBS的增值税发票图片文件的URL）中的文字内容，并将识别的结果返回给用户。 说明： 该增值税发票仅限于中华人民共和国境内使用的增值税发票。
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     *
     * @param RecognizeVatInvoiceRequest 请求对象
     * @return RecognizeVatInvoiceResponse */
    public RecognizeVatInvoiceResponse recognizeVatInvoice(RecognizeVatInvoiceRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeVatInvoice);
    }

    /** 增值税发票识别 识别用户上传的增值税发票图片（或者用户提供的华为云上OBS的增值税发票图片文件的URL）中的文字内容，并将识别的结果返回给用户。 说明： 该增值税发票仅限于中华人民共和国境内使用的增值税发票。
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     *
     * @param RecognizeVatInvoiceRequest 请求对象
     * @return SyncInvoker<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse> */
    public SyncInvoker<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse> recognizeVatInvoiceInvoker(
        RecognizeVatInvoiceRequest request) {
        return new SyncInvoker<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse>(request,
            OcrMeta.recognizeVatInvoice, hcClient);
    }

    /** 行驶证识别 识别用户上传的行驶证图片（或者用户提供的华为云上OBS的行驶证图片文件的URL）中主页和副页的文字内容，并将识别的结果返回给用户。 说明： 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     *
     * @param RecognizeVehicleLicenseRequest 请求对象
     * @return RecognizeVehicleLicenseResponse */
    public RecognizeVehicleLicenseResponse recognizeVehicleLicense(RecognizeVehicleLicenseRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeVehicleLicense);
    }

    /** 行驶证识别 识别用户上传的行驶证图片（或者用户提供的华为云上OBS的行驶证图片文件的URL）中主页和副页的文字内容，并将识别的结果返回给用户。 说明： 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     *
     * @param RecognizeVehicleLicenseRequest 请求对象
     * @return SyncInvoker<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse> */
    public SyncInvoker<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse> recognizeVehicleLicenseInvoker(
        RecognizeVehicleLicenseRequest request) {
        return new SyncInvoker<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse>(request,
            OcrMeta.recognizeVehicleLicense, hcClient);
    }

    /** 网络图片识别 识别网络图片中的文字内容，并返回识别的结构化结果。
     *
     * @param RecognizeWebImageRequest 请求对象
     * @return RecognizeWebImageResponse */
    public RecognizeWebImageResponse recognizeWebImage(RecognizeWebImageRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeWebImage);
    }

    /** 网络图片识别 识别网络图片中的文字内容，并返回识别的结构化结果。
     *
     * @param RecognizeWebImageRequest 请求对象
     * @return SyncInvoker<RecognizeWebImageRequest, RecognizeWebImageResponse> */
    public SyncInvoker<RecognizeWebImageRequest, RecognizeWebImageResponse> recognizeWebImageInvoker(
        RecognizeWebImageRequest request) {
        return new SyncInvoker<RecognizeWebImageRequest, RecognizeWebImageResponse>(request, OcrMeta.recognizeWebImage,
            hcClient);
    }

    /** VIN码识别 识别图片中的车架号信息，并将识别结果返回给用户。
     *
     * @param RecognizeVinRequest 请求对象
     * @return RecognizeVinResponse */
    public RecognizeVinResponse recognizeVin(RecognizeVinRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeVin);
    }

    /** VIN码识别 识别图片中的车架号信息，并将识别结果返回给用户。
     *
     * @param RecognizeVinRequest 请求对象
     * @return SyncInvoker<RecognizeVinRequest, RecognizeVinResponse> */
    public SyncInvoker<RecognizeVinRequest, RecognizeVinResponse> recognizeVinInvoker(RecognizeVinRequest request) {
        return new SyncInvoker<RecognizeVinRequest, RecognizeVinResponse>(request, OcrMeta.recognizeVin, hcClient);
    }

}
