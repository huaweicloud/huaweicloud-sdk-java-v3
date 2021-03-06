package com.huaweicloud.sdk.ocr.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.ocr.v1.model.*;

public class OcrAsyncClient {
    protected HcClient hcClient;

    public OcrAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OcrAsyncClient> newBuilder() {
        return new ClientBuilder<>(OcrAsyncClient::new, "BasicCredentials");
    }


    /**
     * 智能分类识别
     * 检测定位图片上指定要识别的票证（票据、证件或其他文字载体），并对其进行结构化识别。接口以列表形式返回图片上要识别票证的位置坐标、结构化识别的内容以及对应的类别。  计费次数说明：  只对识别成功的票证进行计费，识别失败的票证不计费。例如图片中包含三张票证，有两张识别成功，一张识别失败，此时接口计费两次。 
     *
     * @param RecognizeAutoClassificationRequest 请求对象
     * @return CompletableFuture<RecognizeAutoClassificationResponse>
     */
    public CompletableFuture<RecognizeAutoClassificationResponse> recognizeAutoClassificationAsync(RecognizeAutoClassificationRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeAutoClassification);
    }

    /**
     * 智能分类识别
     * 检测定位图片上指定要识别的票证（票据、证件或其他文字载体），并对其进行结构化识别。接口以列表形式返回图片上要识别票证的位置坐标、结构化识别的内容以及对应的类别。  计费次数说明：  只对识别成功的票证进行计费，识别失败的票证不计费。例如图片中包含三张票证，有两张识别成功，一张识别失败，此时接口计费两次。 
     *
     * @param RecognizeAutoClassificationRequest 请求对象
     * @return AsyncInvoker<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse>
     */
    public AsyncInvoker<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse> recognizeAutoClassificationAsyncInvoker(RecognizeAutoClassificationRequest request) {
        return new AsyncInvoker<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse>(request, OcrMeta.recognizeAutoClassification, hcClient);
    }

    /**
     * 银行卡识别
     * 识别银行卡上的关键文字信息，并返回识别的结构化结果。  说明：  如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。 
     *
     * @param RecognizeBankcardRequest 请求对象
     * @return CompletableFuture<RecognizeBankcardResponse>
     */
    public CompletableFuture<RecognizeBankcardResponse> recognizeBankcardAsync(RecognizeBankcardRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeBankcard);
    }

    /**
     * 银行卡识别
     * 识别银行卡上的关键文字信息，并返回识别的结构化结果。  说明：  如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。 
     *
     * @param RecognizeBankcardRequest 请求对象
     * @return AsyncInvoker<RecognizeBankcardRequest, RecognizeBankcardResponse>
     */
    public AsyncInvoker<RecognizeBankcardRequest, RecognizeBankcardResponse> recognizeBankcardAsyncInvoker(RecognizeBankcardRequest request) {
        return new AsyncInvoker<RecognizeBankcardRequest, RecognizeBankcardResponse>(request, OcrMeta.recognizeBankcard, hcClient);
    }

    /**
     * 名片识别
     * 识别名片图片上的文字信息，并返回识别的结构化结果。支持对多种不同版式名片进行结构化信息提取。
     *
     * @param RecognizeBusinessCardRequest 请求对象
     * @return CompletableFuture<RecognizeBusinessCardResponse>
     */
    public CompletableFuture<RecognizeBusinessCardResponse> recognizeBusinessCardAsync(RecognizeBusinessCardRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeBusinessCard);
    }

    /**
     * 名片识别
     * 识别名片图片上的文字信息，并返回识别的结构化结果。支持对多种不同版式名片进行结构化信息提取。
     *
     * @param RecognizeBusinessCardRequest 请求对象
     * @return AsyncInvoker<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse>
     */
    public AsyncInvoker<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse> recognizeBusinessCardAsyncInvoker(RecognizeBusinessCardRequest request) {
        return new AsyncInvoker<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse>(request, OcrMeta.recognizeBusinessCard, hcClient);
    }

    /**
     * 营业执照识别
     * 识别营业执照首页图片中的文字信息，并返回识别的结构化结果。  说明：   如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。 
     *
     * @param RecognizeBusinessLicenseRequest 请求对象
     * @return CompletableFuture<RecognizeBusinessLicenseResponse>
     */
    public CompletableFuture<RecognizeBusinessLicenseResponse> recognizeBusinessLicenseAsync(RecognizeBusinessLicenseRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeBusinessLicense);
    }

    /**
     * 营业执照识别
     * 识别营业执照首页图片中的文字信息，并返回识别的结构化结果。  说明：   如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。 
     *
     * @param RecognizeBusinessLicenseRequest 请求对象
     * @return AsyncInvoker<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse>
     */
    public AsyncInvoker<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse> recognizeBusinessLicenseAsyncInvoker(RecognizeBusinessLicenseRequest request) {
        return new AsyncInvoker<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse>(request, OcrMeta.recognizeBusinessLicense, hcClient);
    }

    /**
     * 驾驶证识别
     * 识别用户上传的驾驶证图片（或者用户提供的华为云上OBS的驾驶证图片文件的URL）中主页与副页的文字内容，并将识别的结果返回给用户。  说明：   如果图片中包含多张卡证票据，请调用智能分类识别服务。 
     *
     * @param RecognizeDriverLicenseRequest 请求对象
     * @return CompletableFuture<RecognizeDriverLicenseResponse>
     */
    public CompletableFuture<RecognizeDriverLicenseResponse> recognizeDriverLicenseAsync(RecognizeDriverLicenseRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeDriverLicense);
    }

    /**
     * 驾驶证识别
     * 识别用户上传的驾驶证图片（或者用户提供的华为云上OBS的驾驶证图片文件的URL）中主页与副页的文字内容，并将识别的结果返回给用户。  说明：   如果图片中包含多张卡证票据，请调用智能分类识别服务。 
     *
     * @param RecognizeDriverLicenseRequest 请求对象
     * @return AsyncInvoker<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse>
     */
    public AsyncInvoker<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse> recognizeDriverLicenseAsyncInvoker(RecognizeDriverLicenseRequest request) {
        return new AsyncInvoker<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse>(request, OcrMeta.recognizeDriverLicense, hcClient);
    }

    /**
     * 飞机行程单识别
     * 识别飞机行程单中的文字信息，并返回识别的结构化结果。  说明：  如果图片中包含多张卡证票据，请调用智能分类识别服务。 
     *
     * @param RecognizeFlightItineraryRequest 请求对象
     * @return CompletableFuture<RecognizeFlightItineraryResponse>
     */
    public CompletableFuture<RecognizeFlightItineraryResponse> recognizeFlightItineraryAsync(RecognizeFlightItineraryRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeFlightItinerary);
    }

    /**
     * 飞机行程单识别
     * 识别飞机行程单中的文字信息，并返回识别的结构化结果。  说明：  如果图片中包含多张卡证票据，请调用智能分类识别服务。 
     *
     * @param RecognizeFlightItineraryRequest 请求对象
     * @return AsyncInvoker<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse>
     */
    public AsyncInvoker<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse> recognizeFlightItineraryAsyncInvoker(RecognizeFlightItineraryRequest request) {
        return new AsyncInvoker<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse>(request, OcrMeta.recognizeFlightItinerary, hcClient);
    }

    /**
     * 通用表格识别
     * 识别用于识别用户上传的通用表格图片（或者用户提供的华为云上OBS的通用表格图片文件的URL）中的文字内容，并将识别的结果返回给用户。
     *
     * @param RecognizeGeneralTableRequest 请求对象
     * @return CompletableFuture<RecognizeGeneralTableResponse>
     */
    public CompletableFuture<RecognizeGeneralTableResponse> recognizeGeneralTableAsync(RecognizeGeneralTableRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeGeneralTable);
    }

    /**
     * 通用表格识别
     * 识别用于识别用户上传的通用表格图片（或者用户提供的华为云上OBS的通用表格图片文件的URL）中的文字内容，并将识别的结果返回给用户。
     *
     * @param RecognizeGeneralTableRequest 请求对象
     * @return AsyncInvoker<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse>
     */
    public AsyncInvoker<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse> recognizeGeneralTableAsyncInvoker(RecognizeGeneralTableRequest request) {
        return new AsyncInvoker<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse>(request, OcrMeta.recognizeGeneralTable, hcClient);
    }

    /**
     * 通用文字识别
     * 识别图片上的文字信息，返回识别的文字和坐标。支持扫描文件、电子文档、书籍、票据和表单等多种场景的文字识别。
     *
     * @param RecognizeGeneralTextRequest 请求对象
     * @return CompletableFuture<RecognizeGeneralTextResponse>
     */
    public CompletableFuture<RecognizeGeneralTextResponse> recognizeGeneralTextAsync(RecognizeGeneralTextRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeGeneralText);
    }

    /**
     * 通用文字识别
     * 识别图片上的文字信息，返回识别的文字和坐标。支持扫描文件、电子文档、书籍、票据和表单等多种场景的文字识别。
     *
     * @param RecognizeGeneralTextRequest 请求对象
     * @return AsyncInvoker<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse>
     */
    public AsyncInvoker<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse> recognizeGeneralTextAsyncInvoker(RecognizeGeneralTextRequest request) {
        return new AsyncInvoker<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse>(request, OcrMeta.recognizeGeneralText, hcClient);
    }

    /**
     * 手写文字识别
     * 识别文档中的手写文字信息，并将识别的结构化结果返回给用户。
     *
     * @param RecognizeHandwritingRequest 请求对象
     * @return CompletableFuture<RecognizeHandwritingResponse>
     */
    public CompletableFuture<RecognizeHandwritingResponse> recognizeHandwritingAsync(RecognizeHandwritingRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeHandwriting);
    }

    /**
     * 手写文字识别
     * 识别文档中的手写文字信息，并将识别的结构化结果返回给用户。
     *
     * @param RecognizeHandwritingRequest 请求对象
     * @return AsyncInvoker<RecognizeHandwritingRequest, RecognizeHandwritingResponse>
     */
    public AsyncInvoker<RecognizeHandwritingRequest, RecognizeHandwritingResponse> recognizeHandwritingAsyncInvoker(RecognizeHandwritingRequest request) {
        return new AsyncInvoker<RecognizeHandwritingRequest, RecognizeHandwritingResponse>(request, OcrMeta.recognizeHandwriting, hcClient);
    }

    /**
     * 身份证识别
     * 识别身份证图片中的文字内容，并将识别的结果返回给用户。  说明：   身份证识别只支持中国大陆汉族身份证识别。  如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。 
     *
     * @param RecognizeIdCardRequest 请求对象
     * @return CompletableFuture<RecognizeIdCardResponse>
     */
    public CompletableFuture<RecognizeIdCardResponse> recognizeIdCardAsync(RecognizeIdCardRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeIdCard);
    }

    /**
     * 身份证识别
     * 识别身份证图片中的文字内容，并将识别的结果返回给用户。  说明：   身份证识别只支持中国大陆汉族身份证识别。  如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。 
     *
     * @param RecognizeIdCardRequest 请求对象
     * @return AsyncInvoker<RecognizeIdCardRequest, RecognizeIdCardResponse>
     */
    public AsyncInvoker<RecognizeIdCardRequest, RecognizeIdCardResponse> recognizeIdCardAsyncInvoker(RecognizeIdCardRequest request) {
        return new AsyncInvoker<RecognizeIdCardRequest, RecognizeIdCardResponse>(request, OcrMeta.recognizeIdCard, hcClient);
    }

    /**
     * 车牌识别
     * 识别输入图片中的车牌信息，并返回其坐标和内容。 
     *
     * @param RecognizeLicensePlateRequest 请求对象
     * @return CompletableFuture<RecognizeLicensePlateResponse>
     */
    public CompletableFuture<RecognizeLicensePlateResponse> recognizeLicensePlateAsync(RecognizeLicensePlateRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeLicensePlate);
    }

    /**
     * 车牌识别
     * 识别输入图片中的车牌信息，并返回其坐标和内容。 
     *
     * @param RecognizeLicensePlateRequest 请求对象
     * @return AsyncInvoker<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse>
     */
    public AsyncInvoker<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse> recognizeLicensePlateAsyncInvoker(RecognizeLicensePlateRequest request) {
        return new AsyncInvoker<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse>(request, OcrMeta.recognizeLicensePlate, hcClient);
    }

    /**
     * 机动车销售发票识别
     * 识别机动车销售发票图片中的文字内容，并将识别的结果返回给用户。  说明：  该增值税发票仅限于中华人民共和国境内使用的增值税发票。  如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。 
     *
     * @param RecognizeMvsInvoiceRequest 请求对象
     * @return CompletableFuture<RecognizeMvsInvoiceResponse>
     */
    public CompletableFuture<RecognizeMvsInvoiceResponse> recognizeMvsInvoiceAsync(RecognizeMvsInvoiceRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeMvsInvoice);
    }

    /**
     * 机动车销售发票识别
     * 识别机动车销售发票图片中的文字内容，并将识别的结果返回给用户。  说明：  该增值税发票仅限于中华人民共和国境内使用的增值税发票。  如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。 
     *
     * @param RecognizeMvsInvoiceRequest 请求对象
     * @return AsyncInvoker<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse>
     */
    public AsyncInvoker<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse> recognizeMvsInvoiceAsyncInvoker(RecognizeMvsInvoiceRequest request) {
        return new AsyncInvoker<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse>(request, OcrMeta.recognizeMvsInvoice, hcClient);
    }

    /**
     * 护照识别
     * 识别用户上传的护照首页图片中的文字信息，并返回识别的结构化结果。当前版本支持中国护照的全字段识别。外国护照支持护照下方两行国际标准化的机读码识别，并可从中提取6-7个关键字段信息。  说明：  如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。 
     *
     * @param RecognizePassportRequest 请求对象
     * @return CompletableFuture<RecognizePassportResponse>
     */
    public CompletableFuture<RecognizePassportResponse> recognizePassportAsync(RecognizePassportRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizePassport);
    }

    /**
     * 护照识别
     * 识别用户上传的护照首页图片中的文字信息，并返回识别的结构化结果。当前版本支持中国护照的全字段识别。外国护照支持护照下方两行国际标准化的机读码识别，并可从中提取6-7个关键字段信息。  说明：  如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。 
     *
     * @param RecognizePassportRequest 请求对象
     * @return AsyncInvoker<RecognizePassportRequest, RecognizePassportResponse>
     */
    public AsyncInvoker<RecognizePassportRequest, RecognizePassportResponse> recognizePassportAsyncInvoker(RecognizePassportRequest request) {
        return new AsyncInvoker<RecognizePassportRequest, RecognizePassportResponse>(request, OcrMeta.recognizePassport, hcClient);
    }

    /**
     * 定额发票识别
     * 识别定额发票中的文字信息，并返回识别的结构化结果。  说明：   如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。 
     *
     * @param RecognizeQuotaInvoiceRequest 请求对象
     * @return CompletableFuture<RecognizeQuotaInvoiceResponse>
     */
    public CompletableFuture<RecognizeQuotaInvoiceResponse> recognizeQuotaInvoiceAsync(RecognizeQuotaInvoiceRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeQuotaInvoice);
    }

    /**
     * 定额发票识别
     * 识别定额发票中的文字信息，并返回识别的结构化结果。  说明：   如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。 
     *
     * @param RecognizeQuotaInvoiceRequest 请求对象
     * @return AsyncInvoker<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse>
     */
    public AsyncInvoker<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse> recognizeQuotaInvoiceAsyncInvoker(RecognizeQuotaInvoiceRequest request) {
        return new AsyncInvoker<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse>(request, OcrMeta.recognizeQuotaInvoice, hcClient);
    }

    /**
     * 出租车发票识别
     * 识别出租车发票中的文字信息，并返回识别的结构化结果。  说明：  如果图片中包含多张卡证票据，请调用智能分类识别服务。 
     *
     * @param RecognizeTaxiInvoiceRequest 请求对象
     * @return CompletableFuture<RecognizeTaxiInvoiceResponse>
     */
    public CompletableFuture<RecognizeTaxiInvoiceResponse> recognizeTaxiInvoiceAsync(RecognizeTaxiInvoiceRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeTaxiInvoice);
    }

    /**
     * 出租车发票识别
     * 识别出租车发票中的文字信息，并返回识别的结构化结果。  说明：  如果图片中包含多张卡证票据，请调用智能分类识别服务。 
     *
     * @param RecognizeTaxiInvoiceRequest 请求对象
     * @return AsyncInvoker<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse>
     */
    public AsyncInvoker<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse> recognizeTaxiInvoiceAsyncInvoker(RecognizeTaxiInvoiceRequest request) {
        return new AsyncInvoker<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse>(request, OcrMeta.recognizeTaxiInvoice, hcClient);
    }

    /**
     * 车辆通行费发票识别
     * 识别车辆通行费发票中的文字信息，并返回识别的结构化结果。  说明：  如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。 
     *
     * @param RecognizeTollInvoiceRequest 请求对象
     * @return CompletableFuture<RecognizeTollInvoiceResponse>
     */
    public CompletableFuture<RecognizeTollInvoiceResponse> recognizeTollInvoiceAsync(RecognizeTollInvoiceRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeTollInvoice);
    }

    /**
     * 车辆通行费发票识别
     * 识别车辆通行费发票中的文字信息，并返回识别的结构化结果。  说明：  如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。 
     *
     * @param RecognizeTollInvoiceRequest 请求对象
     * @return AsyncInvoker<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse>
     */
    public AsyncInvoker<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse> recognizeTollInvoiceAsyncInvoker(RecognizeTollInvoiceRequest request) {
        return new AsyncInvoker<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse>(request, OcrMeta.recognizeTollInvoice, hcClient);
    }

    /**
     * 火车票识别
     * 识别火车票中的文字信息，并返回识别的结构化结果。  说明：  如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。 
     *
     * @param RecognizeTrainTicketRequest 请求对象
     * @return CompletableFuture<RecognizeTrainTicketResponse>
     */
    public CompletableFuture<RecognizeTrainTicketResponse> recognizeTrainTicketAsync(RecognizeTrainTicketRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeTrainTicket);
    }

    /**
     * 火车票识别
     * 识别火车票中的文字信息，并返回识别的结构化结果。  说明：  如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。 
     *
     * @param RecognizeTrainTicketRequest 请求对象
     * @return AsyncInvoker<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse>
     */
    public AsyncInvoker<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse> recognizeTrainTicketAsyncInvoker(RecognizeTrainTicketRequest request) {
        return new AsyncInvoker<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse>(request, OcrMeta.recognizeTrainTicket, hcClient);
    }

    /**
     * 道路运输证识别
     * 识别道路运输证首页中的文字信息，并返回识别的结构化结果。  说明： 如果图片中包含多张卡证票据，请调用智能分类识别服务。 
     *
     * @param RecognizeTransportationLicenseRequest 请求对象
     * @return CompletableFuture<RecognizeTransportationLicenseResponse>
     */
    public CompletableFuture<RecognizeTransportationLicenseResponse> recognizeTransportationLicenseAsync(RecognizeTransportationLicenseRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeTransportationLicense);
    }

    /**
     * 道路运输证识别
     * 识别道路运输证首页中的文字信息，并返回识别的结构化结果。  说明： 如果图片中包含多张卡证票据，请调用智能分类识别服务。 
     *
     * @param RecognizeTransportationLicenseRequest 请求对象
     * @return AsyncInvoker<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse>
     */
    public AsyncInvoker<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse> recognizeTransportationLicenseAsyncInvoker(RecognizeTransportationLicenseRequest request) {
        return new AsyncInvoker<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse>(request, OcrMeta.recognizeTransportationLicense, hcClient);
    }

    /**
     * 增值税发票识别
     * 识别用户上传的增值税发票图片（或者用户提供的华为云上OBS的增值税发票图片文件的URL）中的文字内容，并将识别的结果返回给用户。  说明：  该增值税发票仅限于中华人民共和国境内使用的增值税发票。  如果图片中包含多张卡证票据，请调用智能分类识别服务。 
     *
     * @param RecognizeVatInvoiceRequest 请求对象
     * @return CompletableFuture<RecognizeVatInvoiceResponse>
     */
    public CompletableFuture<RecognizeVatInvoiceResponse> recognizeVatInvoiceAsync(RecognizeVatInvoiceRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeVatInvoice);
    }

    /**
     * 增值税发票识别
     * 识别用户上传的增值税发票图片（或者用户提供的华为云上OBS的增值税发票图片文件的URL）中的文字内容，并将识别的结果返回给用户。  说明：  该增值税发票仅限于中华人民共和国境内使用的增值税发票。  如果图片中包含多张卡证票据，请调用智能分类识别服务。 
     *
     * @param RecognizeVatInvoiceRequest 请求对象
     * @return AsyncInvoker<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse>
     */
    public AsyncInvoker<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse> recognizeVatInvoiceAsyncInvoker(RecognizeVatInvoiceRequest request) {
        return new AsyncInvoker<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse>(request, OcrMeta.recognizeVatInvoice, hcClient);
    }

    /**
     * 行驶证识别
     * 识别用户上传的行驶证图片（或者用户提供的华为云上OBS的行驶证图片文件的URL）中主页和副页的文字内容，并将识别的结果返回给用户。  说明：  如果图片中包含多张卡证票据，请调用智能分类识别服务。 
     *
     * @param RecognizeVehicleLicenseRequest 请求对象
     * @return CompletableFuture<RecognizeVehicleLicenseResponse>
     */
    public CompletableFuture<RecognizeVehicleLicenseResponse> recognizeVehicleLicenseAsync(RecognizeVehicleLicenseRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeVehicleLicense);
    }

    /**
     * 行驶证识别
     * 识别用户上传的行驶证图片（或者用户提供的华为云上OBS的行驶证图片文件的URL）中主页和副页的文字内容，并将识别的结果返回给用户。  说明：  如果图片中包含多张卡证票据，请调用智能分类识别服务。 
     *
     * @param RecognizeVehicleLicenseRequest 请求对象
     * @return AsyncInvoker<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse>
     */
    public AsyncInvoker<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse> recognizeVehicleLicenseAsyncInvoker(RecognizeVehicleLicenseRequest request) {
        return new AsyncInvoker<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse>(request, OcrMeta.recognizeVehicleLicense, hcClient);
    }

    /**
     * 网络图片识别
     * 识别网络图片中的文字内容，并返回识别的结构化结果。
     *
     * @param RecognizeWebImageRequest 请求对象
     * @return CompletableFuture<RecognizeWebImageResponse>
     */
    public CompletableFuture<RecognizeWebImageResponse> recognizeWebImageAsync(RecognizeWebImageRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeWebImage);
    }

    /**
     * 网络图片识别
     * 识别网络图片中的文字内容，并返回识别的结构化结果。
     *
     * @param RecognizeWebImageRequest 请求对象
     * @return AsyncInvoker<RecognizeWebImageRequest, RecognizeWebImageResponse>
     */
    public AsyncInvoker<RecognizeWebImageRequest, RecognizeWebImageResponse> recognizeWebImageAsyncInvoker(RecognizeWebImageRequest request) {
        return new AsyncInvoker<RecognizeWebImageRequest, RecognizeWebImageResponse>(request, OcrMeta.recognizeWebImage, hcClient);
    }

    /**
     * VIN码识别
     * 识别图片中的车架号信息，并将识别结果返回给用户。 
     *
     * @param RecognizeVinRequest 请求对象
     * @return CompletableFuture<RecognizeVinResponse>
     */
    public CompletableFuture<RecognizeVinResponse> recognizeVinAsync(RecognizeVinRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeVin);
    }

    /**
     * VIN码识别
     * 识别图片中的车架号信息，并将识别结果返回给用户。 
     *
     * @param RecognizeVinRequest 请求对象
     * @return AsyncInvoker<RecognizeVinRequest, RecognizeVinResponse>
     */
    public AsyncInvoker<RecognizeVinRequest, RecognizeVinResponse> recognizeVinAsyncInvoker(RecognizeVinRequest request) {
        return new AsyncInvoker<RecognizeVinRequest, RecognizeVinResponse>(request, OcrMeta.recognizeVin, hcClient);
    }

}