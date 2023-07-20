package com.huaweicloud.sdk.ocr.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeAutoClassificationRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeAutoClassificationResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeBankcardRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeBankcardResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeBusinessCardRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeBusinessCardResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeBusinessLicenseRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeBusinessLicenseResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeCambodianIdCardRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeCambodianIdCardResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeChileIdCardRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeChileIdCardResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeCustomTemplateRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeCustomTemplateResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeDriverLicenseRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeDriverLicenseResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeExitEntryPermitRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeExitEntryPermitResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeFinancialStatementRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeFinancialStatementResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeFlightItineraryRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeFlightItineraryResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeGeneralTableRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeGeneralTableResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeGeneralTextRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeGeneralTextResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeHandwritingRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeHandwritingResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeHealthCodeRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeHealthCodeResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeHkIdCardRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeHkIdCardResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeIdCardRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeIdCardResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeIdDocumentRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeIdDocumentResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeInsurancePolicyRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeInsurancePolicyResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeInvoiceVerificationRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeInvoiceVerificationResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeLicensePlateRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeLicensePlateResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeMacaoIdCardRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeMacaoIdCardResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeMainlandTravelPermitRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeMainlandTravelPermitResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeMvsInvoiceRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeMvsInvoiceResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeMyanmarDriverLicenseRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeMyanmarDriverLicenseResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeMyanmarIdcardRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeMyanmarIdcardResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizePassportRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizePassportResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizePcrTestRecordRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizePcrTestRecordResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeQualificationCertificateRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeQualificationCertificateResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeQuotaInvoiceRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeQuotaInvoiceResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeTaxiInvoiceRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeTaxiInvoiceResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeThailandIdcardRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeThailandIdcardResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeThailandLicensePlateRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeThailandLicensePlateResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeTollInvoiceRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeTollInvoiceResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeTrainTicketRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeTrainTicketResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeTransportationLicenseRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeTransportationLicenseResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeVatInvoiceRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeVatInvoiceResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeVehicleLicenseRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeVehicleLicenseResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeVinRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeVinResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeWaybillElectronicRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeWaybillElectronicResponse;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeWebImageRequest;
import com.huaweicloud.sdk.ocr.v1.model.RecognizeWebImageResponse;

import java.util.concurrent.CompletableFuture;

public class OcrAsyncClient {

    protected HcClient hcClient;

    public OcrAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OcrAsyncClient> newBuilder() {
        ClientBuilder<OcrAsyncClient> clientBuilder = new ClientBuilder<>(OcrAsyncClient::new, "BasicCredentials");
        return clientBuilder;
    }

    /**
     * 智能分类识别
     *
     * 检测定位图片上指定要识别的票证（票据、证件或其他文字载体），并对其进行结构化识别。接口以列表形式返回图片上要识别票证的位置坐标、结构化识别的内容以及对应的类别。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section3)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 计费次数说明：
     * 只对识别成功的票证进行计费，识别失败的票证不计费。例如图片中包含三张票证，有两张识别成功，一张识别失败，此时接口计费两次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeAutoClassificationRequest 请求对象
     * @return CompletableFuture<RecognizeAutoClassificationResponse>
     */
    public CompletableFuture<RecognizeAutoClassificationResponse> recognizeAutoClassificationAsync(
        RecognizeAutoClassificationRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeAutoClassification);
    }

    /**
     * 智能分类识别
     *
     * 检测定位图片上指定要识别的票证（票据、证件或其他文字载体），并对其进行结构化识别。接口以列表形式返回图片上要识别票证的位置坐标、结构化识别的内容以及对应的类别。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section3)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 计费次数说明：
     * 只对识别成功的票证进行计费，识别失败的票证不计费。例如图片中包含三张票证，有两张识别成功，一张识别失败，此时接口计费两次。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeAutoClassificationRequest 请求对象
     * @return AsyncInvoker<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse>
     */
    public AsyncInvoker<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse> recognizeAutoClassificationAsyncInvoker(
        RecognizeAutoClassificationRequest request) {
        return new AsyncInvoker<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse>(request,
            OcrMeta.recognizeAutoClassification, hcClient);
    }

    /**
     * 银行卡识别
     *
     * 识别银行卡上的关键文字信息，并返回识别的结构化结果。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section9)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeBankcardRequest 请求对象
     * @return CompletableFuture<RecognizeBankcardResponse>
     */
    public CompletableFuture<RecognizeBankcardResponse> recognizeBankcardAsync(RecognizeBankcardRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeBankcard);
    }

    /**
     * 银行卡识别
     *
     * 识别银行卡上的关键文字信息，并返回识别的结构化结果。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section9)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeBankcardRequest 请求对象
     * @return AsyncInvoker<RecognizeBankcardRequest, RecognizeBankcardResponse>
     */
    public AsyncInvoker<RecognizeBankcardRequest, RecognizeBankcardResponse> recognizeBankcardAsyncInvoker(
        RecognizeBankcardRequest request) {
        return new AsyncInvoker<RecognizeBankcardRequest, RecognizeBankcardResponse>(request, OcrMeta.recognizeBankcard,
            hcClient);
    }

    /**
     * 名片识别
     *
     * 识别名片图片上的文字信息，并返回识别的结构化结果。支持对多种不同版式名片进行结构化信息提取。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section13)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeBusinessCardRequest 请求对象
     * @return CompletableFuture<RecognizeBusinessCardResponse>
     */
    public CompletableFuture<RecognizeBusinessCardResponse> recognizeBusinessCardAsync(
        RecognizeBusinessCardRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeBusinessCard);
    }

    /**
     * 名片识别
     *
     * 识别名片图片上的文字信息，并返回识别的结构化结果。支持对多种不同版式名片进行结构化信息提取。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section13)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeBusinessCardRequest 请求对象
     * @return AsyncInvoker<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse>
     */
    public AsyncInvoker<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse> recognizeBusinessCardAsyncInvoker(
        RecognizeBusinessCardRequest request) {
        return new AsyncInvoker<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse>(request,
            OcrMeta.recognizeBusinessCard, hcClient);
    }

    /**
     * 营业执照识别
     *
     * 识别营业执照首页图片中的文字信息，并返回识别的结构化结果。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section10)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * 说明： 
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeBusinessLicenseRequest 请求对象
     * @return CompletableFuture<RecognizeBusinessLicenseResponse>
     */
    public CompletableFuture<RecognizeBusinessLicenseResponse> recognizeBusinessLicenseAsync(
        RecognizeBusinessLicenseRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeBusinessLicense);
    }

    /**
     * 营业执照识别
     *
     * 识别营业执照首页图片中的文字信息，并返回识别的结构化结果。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section10)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * 说明： 
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeBusinessLicenseRequest 请求对象
     * @return AsyncInvoker<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse>
     */
    public AsyncInvoker<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse> recognizeBusinessLicenseAsyncInvoker(
        RecognizeBusinessLicenseRequest request) {
        return new AsyncInvoker<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse>(request,
            OcrMeta.recognizeBusinessLicense, hcClient);
    }

    /**
     * 柬文身份证识别
     *
     * 识别柬文身份证图片中的文字内容，并将识别的结构化结果返回给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeCambodianIdCardRequest 请求对象
     * @return CompletableFuture<RecognizeCambodianIdCardResponse>
     */
    public CompletableFuture<RecognizeCambodianIdCardResponse> recognizeCambodianIdCardAsync(
        RecognizeCambodianIdCardRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeCambodianIdCard);
    }

    /**
     * 柬文身份证识别
     *
     * 识别柬文身份证图片中的文字内容，并将识别的结构化结果返回给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeCambodianIdCardRequest 请求对象
     * @return AsyncInvoker<RecognizeCambodianIdCardRequest, RecognizeCambodianIdCardResponse>
     */
    public AsyncInvoker<RecognizeCambodianIdCardRequest, RecognizeCambodianIdCardResponse> recognizeCambodianIdCardAsyncInvoker(
        RecognizeCambodianIdCardRequest request) {
        return new AsyncInvoker<RecognizeCambodianIdCardRequest, RecognizeCambodianIdCardResponse>(request,
            OcrMeta.recognizeCambodianIdCard, hcClient);
    }

    /**
     * 智利身份证识别
     *
     * 识别智利身份证图片中的文字内容，并返回识别的结构化结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeChileIdCardRequest 请求对象
     * @return CompletableFuture<RecognizeChileIdCardResponse>
     */
    public CompletableFuture<RecognizeChileIdCardResponse> recognizeChileIdCardAsync(
        RecognizeChileIdCardRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeChileIdCard);
    }

    /**
     * 智利身份证识别
     *
     * 识别智利身份证图片中的文字内容，并返回识别的结构化结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeChileIdCardRequest 请求对象
     * @return AsyncInvoker<RecognizeChileIdCardRequest, RecognizeChileIdCardResponse>
     */
    public AsyncInvoker<RecognizeChileIdCardRequest, RecognizeChileIdCardResponse> recognizeChileIdCardAsyncInvoker(
        RecognizeChileIdCardRequest request) {
        return new AsyncInvoker<RecognizeChileIdCardRequest, RecognizeChileIdCardResponse>(request,
            OcrMeta.recognizeChileIdCard, hcClient);
    }

    /**
     * 驾驶证识别
     *
     * 识别用户上传的驾驶证图片（或者用户提供的华为云上OBS的驾驶证图片文件的URL）中主页与副页的文字内容，并将识别的结果返回给用户。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section6)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * 说明： 
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeDriverLicenseRequest 请求对象
     * @return CompletableFuture<RecognizeDriverLicenseResponse>
     */
    public CompletableFuture<RecognizeDriverLicenseResponse> recognizeDriverLicenseAsync(
        RecognizeDriverLicenseRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeDriverLicense);
    }

    /**
     * 驾驶证识别
     *
     * 识别用户上传的驾驶证图片（或者用户提供的华为云上OBS的驾驶证图片文件的URL）中主页与副页的文字内容，并将识别的结果返回给用户。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section6)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * 说明： 
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeDriverLicenseRequest 请求对象
     * @return AsyncInvoker<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse>
     */
    public AsyncInvoker<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse> recognizeDriverLicenseAsyncInvoker(
        RecognizeDriverLicenseRequest request) {
        return new AsyncInvoker<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse>(request,
            OcrMeta.recognizeDriverLicense, hcClient);
    }

    /**
     * 往来港澳台通行证识别
     *
     * 识别往来港澳台证件图片中的文字内容，并将识别的结构化结果返回给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeExitEntryPermitRequest 请求对象
     * @return CompletableFuture<RecognizeExitEntryPermitResponse>
     */
    public CompletableFuture<RecognizeExitEntryPermitResponse> recognizeExitEntryPermitAsync(
        RecognizeExitEntryPermitRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeExitEntryPermit);
    }

    /**
     * 往来港澳台通行证识别
     *
     * 识别往来港澳台证件图片中的文字内容，并将识别的结构化结果返回给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeExitEntryPermitRequest 请求对象
     * @return AsyncInvoker<RecognizeExitEntryPermitRequest, RecognizeExitEntryPermitResponse>
     */
    public AsyncInvoker<RecognizeExitEntryPermitRequest, RecognizeExitEntryPermitResponse> recognizeExitEntryPermitAsyncInvoker(
        RecognizeExitEntryPermitRequest request) {
        return new AsyncInvoker<RecognizeExitEntryPermitRequest, RecognizeExitEntryPermitResponse>(request,
            OcrMeta.recognizeExitEntryPermit, hcClient);
    }

    /**
     * 财务报表识别
     *
     * 识别用户上传的表格图片中的文字内容，并将识别的结果返回给用户。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section24)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeFinancialStatementRequest 请求对象
     * @return CompletableFuture<RecognizeFinancialStatementResponse>
     */
    public CompletableFuture<RecognizeFinancialStatementResponse> recognizeFinancialStatementAsync(
        RecognizeFinancialStatementRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeFinancialStatement);
    }

    /**
     * 财务报表识别
     *
     * 识别用户上传的表格图片中的文字内容，并将识别的结果返回给用户。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section24)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeFinancialStatementRequest 请求对象
     * @return AsyncInvoker<RecognizeFinancialStatementRequest, RecognizeFinancialStatementResponse>
     */
    public AsyncInvoker<RecognizeFinancialStatementRequest, RecognizeFinancialStatementResponse> recognizeFinancialStatementAsyncInvoker(
        RecognizeFinancialStatementRequest request) {
        return new AsyncInvoker<RecognizeFinancialStatementRequest, RecognizeFinancialStatementResponse>(request,
            OcrMeta.recognizeFinancialStatement, hcClient);
    }

    /**
     * 飞机行程单识别
     *
     * 识别飞机行程单中的文字信息，并返回识别的结构化结果。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section20)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeFlightItineraryRequest 请求对象
     * @return CompletableFuture<RecognizeFlightItineraryResponse>
     */
    public CompletableFuture<RecognizeFlightItineraryResponse> recognizeFlightItineraryAsync(
        RecognizeFlightItineraryRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeFlightItinerary);
    }

    /**
     * 飞机行程单识别
     *
     * 识别飞机行程单中的文字信息，并返回识别的结构化结果。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section20)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeFlightItineraryRequest 请求对象
     * @return AsyncInvoker<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse>
     */
    public AsyncInvoker<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse> recognizeFlightItineraryAsyncInvoker(
        RecognizeFlightItineraryRequest request) {
        return new AsyncInvoker<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse>(request,
            OcrMeta.recognizeFlightItinerary, hcClient);
    }

    /**
     * 通用表格识别
     *
     * 用于识别用户上传的通用表格图片（或者用户提供的华为云上OBS的通用表格图片文件的URL）中的文字内容，并将识别的结果返回给用户。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section0)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeGeneralTableRequest 请求对象
     * @return CompletableFuture<RecognizeGeneralTableResponse>
     */
    public CompletableFuture<RecognizeGeneralTableResponse> recognizeGeneralTableAsync(
        RecognizeGeneralTableRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeGeneralTable);
    }

    /**
     * 通用表格识别
     *
     * 用于识别用户上传的通用表格图片（或者用户提供的华为云上OBS的通用表格图片文件的URL）中的文字内容，并将识别的结果返回给用户。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section0)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeGeneralTableRequest 请求对象
     * @return AsyncInvoker<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse>
     */
    public AsyncInvoker<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse> recognizeGeneralTableAsyncInvoker(
        RecognizeGeneralTableRequest request) {
        return new AsyncInvoker<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse>(request,
            OcrMeta.recognizeGeneralTable, hcClient);
    }

    /**
     * 通用文字识别
     *
     * 识别图片上的文字信息，返回识别的文字和坐标。支持扫描文件、电子文档、书籍、票据和表单等多种场景的文字识别。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section1)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeGeneralTextRequest 请求对象
     * @return CompletableFuture<RecognizeGeneralTextResponse>
     */
    public CompletableFuture<RecognizeGeneralTextResponse> recognizeGeneralTextAsync(
        RecognizeGeneralTextRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeGeneralText);
    }

    /**
     * 通用文字识别
     *
     * 识别图片上的文字信息，返回识别的文字和坐标。支持扫描文件、电子文档、书籍、票据和表单等多种场景的文字识别。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section1)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeGeneralTextRequest 请求对象
     * @return AsyncInvoker<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse>
     */
    public AsyncInvoker<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse> recognizeGeneralTextAsyncInvoker(
        RecognizeGeneralTextRequest request) {
        return new AsyncInvoker<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse>(request,
            OcrMeta.recognizeGeneralText, hcClient);
    }

    /**
     * 手写文字识别
     *
     * 识别文档中的手写文字信息，并将识别的结构化结果返回给用户。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section4)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeHandwritingRequest 请求对象
     * @return CompletableFuture<RecognizeHandwritingResponse>
     */
    public CompletableFuture<RecognizeHandwritingResponse> recognizeHandwritingAsync(
        RecognizeHandwritingRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeHandwriting);
    }

    /**
     * 手写文字识别
     *
     * 识别文档中的手写文字信息，并将识别的结构化结果返回给用户。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section4)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeHandwritingRequest 请求对象
     * @return AsyncInvoker<RecognizeHandwritingRequest, RecognizeHandwritingResponse>
     */
    public AsyncInvoker<RecognizeHandwritingRequest, RecognizeHandwritingResponse> recognizeHandwritingAsyncInvoker(
        RecognizeHandwritingRequest request) {
        return new AsyncInvoker<RecognizeHandwritingRequest, RecognizeHandwritingResponse>(request,
            OcrMeta.recognizeHandwriting, hcClient);
    }

    /**
     * 防疫健康码识别
     *
     * 支持对全国各地区不同版式的防疫健康码、核酸检测记录、行程卡中的14个关键字段进行结构化识别；支持识别4种健康码颜色，包括绿码、黄码、红码、灰码；支持返回各个关键字段的置信度，以便提高人工校验效率。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section26)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeHealthCodeRequest 请求对象
     * @return CompletableFuture<RecognizeHealthCodeResponse>
     */
    public CompletableFuture<RecognizeHealthCodeResponse> recognizeHealthCodeAsync(RecognizeHealthCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeHealthCode);
    }

    /**
     * 防疫健康码识别
     *
     * 支持对全国各地区不同版式的防疫健康码、核酸检测记录、行程卡中的14个关键字段进行结构化识别；支持识别4种健康码颜色，包括绿码、黄码、红码、灰码；支持返回各个关键字段的置信度，以便提高人工校验效率。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section26)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeHealthCodeRequest 请求对象
     * @return AsyncInvoker<RecognizeHealthCodeRequest, RecognizeHealthCodeResponse>
     */
    public AsyncInvoker<RecognizeHealthCodeRequest, RecognizeHealthCodeResponse> recognizeHealthCodeAsyncInvoker(
        RecognizeHealthCodeRequest request) {
        return new AsyncInvoker<RecognizeHealthCodeRequest, RecognizeHealthCodeResponse>(request,
            OcrMeta.recognizeHealthCode, hcClient);
    }

    /**
     * 香港身份证识别
     *
     * 识别香港身份证中的文字内容，并将识别的结果返回给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeHkIdCardRequest 请求对象
     * @return CompletableFuture<RecognizeHkIdCardResponse>
     */
    public CompletableFuture<RecognizeHkIdCardResponse> recognizeHkIdCardAsync(RecognizeHkIdCardRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeHkIdCard);
    }

    /**
     * 香港身份证识别
     *
     * 识别香港身份证中的文字内容，并将识别的结果返回给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeHkIdCardRequest 请求对象
     * @return AsyncInvoker<RecognizeHkIdCardRequest, RecognizeHkIdCardResponse>
     */
    public AsyncInvoker<RecognizeHkIdCardRequest, RecognizeHkIdCardResponse> recognizeHkIdCardAsyncInvoker(
        RecognizeHkIdCardRequest request) {
        return new AsyncInvoker<RecognizeHkIdCardRequest, RecognizeHkIdCardResponse>(request, OcrMeta.recognizeHkIdCard,
            hcClient);
    }

    /**
     * 身份证识别
     *
     * 识别身份证图片中的文字内容，并将识别的结果返回给用户。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section5)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * 说明： 
     * 
     * 身份证识别支持中华人民共和国居民身份证识别。
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeIdCardRequest 请求对象
     * @return CompletableFuture<RecognizeIdCardResponse>
     */
    public CompletableFuture<RecognizeIdCardResponse> recognizeIdCardAsync(RecognizeIdCardRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeIdCard);
    }

    /**
     * 身份证识别
     *
     * 识别身份证图片中的文字内容，并将识别的结果返回给用户。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section5)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * 说明： 
     * 
     * 身份证识别支持中华人民共和国居民身份证识别。
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeIdCardRequest 请求对象
     * @return AsyncInvoker<RecognizeIdCardRequest, RecognizeIdCardResponse>
     */
    public AsyncInvoker<RecognizeIdCardRequest, RecognizeIdCardResponse> recognizeIdCardAsyncInvoker(
        RecognizeIdCardRequest request) {
        return new AsyncInvoker<RecognizeIdCardRequest, RecognizeIdCardResponse>(request, OcrMeta.recognizeIdCard,
            hcClient);
    }

    /**
     * 通用证件识别
     *
     * 识别身份证件图像，并将识别的结构化结果返回给用户。支持多个国家/地区的身份证、驾驶证和护照，具体国家/地区和证件列表详见表1国家/地区和证件列表。
     * 
     * **表1国家/地区和证件列表**
     * 
     * | 国家/地区  | 英文名称    | 国家/地区代码 country_region | 支持证件类型 id_type      |
     * | ---------- | ----------- | ---------------------------- | ------------------------- |
     * | 越南       | Vietnam     | VNM                          | PP、DL、ID                |
     * | 印度       | India       | IND                          | PP                        |
     * | 菲律宾     | Philippines | PHL                          | PP、DL、ID（仅支持UUMID） |
     * | 阿尔巴尼亚 | Albania     | ALB                          | PP、DL、ID                |
     * | 巴西       | BRAZIL      | BRA                          | PP                        |
     * | 印度尼西亚 | INDONESIA   | IDN                          | PP                        |
     * | 马来西亚   | MALAYSIA    | MYS                          | PP                        |
     * | 尼日利亚   | NIGERIA     | NGA                          | PP                        |
     * | 巴基斯坦   | PAKISTAN    | PAK                          | PP                        |
     * | 俄罗斯     | RUSSIA      | RUS                          | PP（仅支持国际标准版本）  |
     * | 中国台湾   | TAIWAN      | TWN                          | PP                        |
     * | 乌克兰     | UKRAINE     | UKR                          | PP                        |
     * | 泰国       | THAILAND    | THA                          | ID、PP                    |
     * | 智利       | CHILE       | CHL                          | ID、PP                    |
     * | 中国香港   | HONGKONG    | HKG                          | ID                        |
     * 
     * - PP: passport,国际护照
     * - DL: driving license,驾驶证
     * - ID: identification card,各国颁发的身份证类型证件，比如身份证、选民证、社保卡等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeIdDocumentRequest 请求对象
     * @return CompletableFuture<RecognizeIdDocumentResponse>
     */
    public CompletableFuture<RecognizeIdDocumentResponse> recognizeIdDocumentAsync(RecognizeIdDocumentRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeIdDocument);
    }

    /**
     * 通用证件识别
     *
     * 识别身份证件图像，并将识别的结构化结果返回给用户。支持多个国家/地区的身份证、驾驶证和护照，具体国家/地区和证件列表详见表1国家/地区和证件列表。
     * 
     * **表1国家/地区和证件列表**
     * 
     * | 国家/地区  | 英文名称    | 国家/地区代码 country_region | 支持证件类型 id_type      |
     * | ---------- | ----------- | ---------------------------- | ------------------------- |
     * | 越南       | Vietnam     | VNM                          | PP、DL、ID                |
     * | 印度       | India       | IND                          | PP                        |
     * | 菲律宾     | Philippines | PHL                          | PP、DL、ID（仅支持UUMID） |
     * | 阿尔巴尼亚 | Albania     | ALB                          | PP、DL、ID                |
     * | 巴西       | BRAZIL      | BRA                          | PP                        |
     * | 印度尼西亚 | INDONESIA   | IDN                          | PP                        |
     * | 马来西亚   | MALAYSIA    | MYS                          | PP                        |
     * | 尼日利亚   | NIGERIA     | NGA                          | PP                        |
     * | 巴基斯坦   | PAKISTAN    | PAK                          | PP                        |
     * | 俄罗斯     | RUSSIA      | RUS                          | PP（仅支持国际标准版本）  |
     * | 中国台湾   | TAIWAN      | TWN                          | PP                        |
     * | 乌克兰     | UKRAINE     | UKR                          | PP                        |
     * | 泰国       | THAILAND    | THA                          | ID、PP                    |
     * | 智利       | CHILE       | CHL                          | ID、PP                    |
     * | 中国香港   | HONGKONG    | HKG                          | ID                        |
     * 
     * - PP: passport,国际护照
     * - DL: driving license,驾驶证
     * - ID: identification card,各国颁发的身份证类型证件，比如身份证、选民证、社保卡等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeIdDocumentRequest 请求对象
     * @return AsyncInvoker<RecognizeIdDocumentRequest, RecognizeIdDocumentResponse>
     */
    public AsyncInvoker<RecognizeIdDocumentRequest, RecognizeIdDocumentResponse> recognizeIdDocumentAsyncInvoker(
        RecognizeIdDocumentRequest request) {
        return new AsyncInvoker<RecognizeIdDocumentRequest, RecognizeIdDocumentResponse>(request,
            OcrMeta.recognizeIdDocument, hcClient);
    }

    /**
     * 保险单识别
     *
     * 识别保险单图片上的文字信息，并将识别的结构化结果返回给用户。支持对多种版式保险单的扫描图片及手机照片进行结构化信息提取。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section23)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeInsurancePolicyRequest 请求对象
     * @return CompletableFuture<RecognizeInsurancePolicyResponse>
     */
    public CompletableFuture<RecognizeInsurancePolicyResponse> recognizeInsurancePolicyAsync(
        RecognizeInsurancePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeInsurancePolicy);
    }

    /**
     * 保险单识别
     *
     * 识别保险单图片上的文字信息，并将识别的结构化结果返回给用户。支持对多种版式保险单的扫描图片及手机照片进行结构化信息提取。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section23)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeInsurancePolicyRequest 请求对象
     * @return AsyncInvoker<RecognizeInsurancePolicyRequest, RecognizeInsurancePolicyResponse>
     */
    public AsyncInvoker<RecognizeInsurancePolicyRequest, RecognizeInsurancePolicyResponse> recognizeInsurancePolicyAsyncInvoker(
        RecognizeInsurancePolicyRequest request) {
        return new AsyncInvoker<RecognizeInsurancePolicyRequest, RecognizeInsurancePolicyResponse>(request,
            OcrMeta.recognizeInsurancePolicy, hcClient);
    }

    /**
     * 发票验真
     *
     * 发票验真服务支持10种增值税发票的信息核验，包括增值税专用发票、增值税普通发票、增值税普通发票（卷式）、增值税电子专用发票、增值税电子普通发票、增值税电子普通发票（通行费）、二手车销售统一发票、机动车销售统一发票、区块链电子发票、全电发票，支持返回票面的全部信息。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section16)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeInvoiceVerificationRequest 请求对象
     * @return CompletableFuture<RecognizeInvoiceVerificationResponse>
     */
    public CompletableFuture<RecognizeInvoiceVerificationResponse> recognizeInvoiceVerificationAsync(
        RecognizeInvoiceVerificationRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeInvoiceVerification);
    }

    /**
     * 发票验真
     *
     * 发票验真服务支持10种增值税发票的信息核验，包括增值税专用发票、增值税普通发票、增值税普通发票（卷式）、增值税电子专用发票、增值税电子普通发票、增值税电子普通发票（通行费）、二手车销售统一发票、机动车销售统一发票、区块链电子发票、全电发票，支持返回票面的全部信息。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section16)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeInvoiceVerificationRequest 请求对象
     * @return AsyncInvoker<RecognizeInvoiceVerificationRequest, RecognizeInvoiceVerificationResponse>
     */
    public AsyncInvoker<RecognizeInvoiceVerificationRequest, RecognizeInvoiceVerificationResponse> recognizeInvoiceVerificationAsyncInvoker(
        RecognizeInvoiceVerificationRequest request) {
        return new AsyncInvoker<RecognizeInvoiceVerificationRequest, RecognizeInvoiceVerificationResponse>(request,
            OcrMeta.recognizeInvoiceVerification, hcClient);
    }

    /**
     * 车牌识别
     *
     * 识别输入图片中的车牌信息，并返回其坐标和内容。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section12)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeLicensePlateRequest 请求对象
     * @return CompletableFuture<RecognizeLicensePlateResponse>
     */
    public CompletableFuture<RecognizeLicensePlateResponse> recognizeLicensePlateAsync(
        RecognizeLicensePlateRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeLicensePlate);
    }

    /**
     * 车牌识别
     *
     * 识别输入图片中的车牌信息，并返回其坐标和内容。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section12)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeLicensePlateRequest 请求对象
     * @return AsyncInvoker<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse>
     */
    public AsyncInvoker<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse> recognizeLicensePlateAsyncInvoker(
        RecognizeLicensePlateRequest request) {
        return new AsyncInvoker<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse>(request,
            OcrMeta.recognizeLicensePlate, hcClient);
    }

    /**
     * 澳门身份证识别
     *
     * 识别澳门身份证图片中的文字内容，并将识别的结果返回给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeMacaoIdCardRequest 请求对象
     * @return CompletableFuture<RecognizeMacaoIdCardResponse>
     */
    public CompletableFuture<RecognizeMacaoIdCardResponse> recognizeMacaoIdCardAsync(
        RecognizeMacaoIdCardRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeMacaoIdCard);
    }

    /**
     * 澳门身份证识别
     *
     * 识别澳门身份证图片中的文字内容，并将识别的结果返回给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeMacaoIdCardRequest 请求对象
     * @return AsyncInvoker<RecognizeMacaoIdCardRequest, RecognizeMacaoIdCardResponse>
     */
    public AsyncInvoker<RecognizeMacaoIdCardRequest, RecognizeMacaoIdCardResponse> recognizeMacaoIdCardAsyncInvoker(
        RecognizeMacaoIdCardRequest request) {
        return new AsyncInvoker<RecognizeMacaoIdCardRequest, RecognizeMacaoIdCardResponse>(request,
            OcrMeta.recognizeMacaoIdCard, hcClient);
    }

    /**
     * 港澳台居民来往内地通行证识别
     *
     * 识别港澳居民来往内地通行证上的文字内容，并将识别的结构化结果返回给用户。支持港澳居民来往内地通行证和台湾居民来往内地通行证两种卡证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeMainlandTravelPermitRequest 请求对象
     * @return CompletableFuture<RecognizeMainlandTravelPermitResponse>
     */
    public CompletableFuture<RecognizeMainlandTravelPermitResponse> recognizeMainlandTravelPermitAsync(
        RecognizeMainlandTravelPermitRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeMainlandTravelPermit);
    }

    /**
     * 港澳台居民来往内地通行证识别
     *
     * 识别港澳居民来往内地通行证上的文字内容，并将识别的结构化结果返回给用户。支持港澳居民来往内地通行证和台湾居民来往内地通行证两种卡证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeMainlandTravelPermitRequest 请求对象
     * @return AsyncInvoker<RecognizeMainlandTravelPermitRequest, RecognizeMainlandTravelPermitResponse>
     */
    public AsyncInvoker<RecognizeMainlandTravelPermitRequest, RecognizeMainlandTravelPermitResponse> recognizeMainlandTravelPermitAsyncInvoker(
        RecognizeMainlandTravelPermitRequest request) {
        return new AsyncInvoker<RecognizeMainlandTravelPermitRequest, RecognizeMainlandTravelPermitResponse>(request,
            OcrMeta.recognizeMainlandTravelPermit, hcClient);
    }

    /**
     * 机动车销售发票识别
     *
     * 识别机动车销售发票、二手车销售发票图片（服务能自动分辨两种类型，返回对应的字段）中的文字内容，并将识别的结果以JSON格式返回给用户。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section17)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 说明：
     * 该增值税发票仅限于中华人民共和国境内使用的增值税发票。
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeMvsInvoiceRequest 请求对象
     * @return CompletableFuture<RecognizeMvsInvoiceResponse>
     */
    public CompletableFuture<RecognizeMvsInvoiceResponse> recognizeMvsInvoiceAsync(RecognizeMvsInvoiceRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeMvsInvoice);
    }

    /**
     * 机动车销售发票识别
     *
     * 识别机动车销售发票、二手车销售发票图片（服务能自动分辨两种类型，返回对应的字段）中的文字内容，并将识别的结果以JSON格式返回给用户。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section17)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 说明：
     * 该增值税发票仅限于中华人民共和国境内使用的增值税发票。
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeMvsInvoiceRequest 请求对象
     * @return AsyncInvoker<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse>
     */
    public AsyncInvoker<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse> recognizeMvsInvoiceAsyncInvoker(
        RecognizeMvsInvoiceRequest request) {
        return new AsyncInvoker<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse>(request,
            OcrMeta.recognizeMvsInvoice, hcClient);
    }

    /**
     * 缅文驾驶证识别
     *
     * 识别缅甸驾驶证中的文字信息，并返回识别的结构化结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeMyanmarDriverLicenseRequest 请求对象
     * @return CompletableFuture<RecognizeMyanmarDriverLicenseResponse>
     */
    public CompletableFuture<RecognizeMyanmarDriverLicenseResponse> recognizeMyanmarDriverLicenseAsync(
        RecognizeMyanmarDriverLicenseRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeMyanmarDriverLicense);
    }

    /**
     * 缅文驾驶证识别
     *
     * 识别缅甸驾驶证中的文字信息，并返回识别的结构化结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeMyanmarDriverLicenseRequest 请求对象
     * @return AsyncInvoker<RecognizeMyanmarDriverLicenseRequest, RecognizeMyanmarDriverLicenseResponse>
     */
    public AsyncInvoker<RecognizeMyanmarDriverLicenseRequest, RecognizeMyanmarDriverLicenseResponse> recognizeMyanmarDriverLicenseAsyncInvoker(
        RecognizeMyanmarDriverLicenseRequest request) {
        return new AsyncInvoker<RecognizeMyanmarDriverLicenseRequest, RecognizeMyanmarDriverLicenseResponse>(request,
            OcrMeta.recognizeMyanmarDriverLicense, hcClient);
    }

    /**
     * 缅文身份证识别
     *
     * 识别缅文身份证中的文字信息，并返回识别的结构化结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeMyanmarIdcardRequest 请求对象
     * @return CompletableFuture<RecognizeMyanmarIdcardResponse>
     */
    public CompletableFuture<RecognizeMyanmarIdcardResponse> recognizeMyanmarIdcardAsync(
        RecognizeMyanmarIdcardRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeMyanmarIdcard);
    }

    /**
     * 缅文身份证识别
     *
     * 识别缅文身份证中的文字信息，并返回识别的结构化结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeMyanmarIdcardRequest 请求对象
     * @return AsyncInvoker<RecognizeMyanmarIdcardRequest, RecognizeMyanmarIdcardResponse>
     */
    public AsyncInvoker<RecognizeMyanmarIdcardRequest, RecognizeMyanmarIdcardResponse> recognizeMyanmarIdcardAsyncInvoker(
        RecognizeMyanmarIdcardRequest request) {
        return new AsyncInvoker<RecognizeMyanmarIdcardRequest, RecognizeMyanmarIdcardResponse>(request,
            OcrMeta.recognizeMyanmarIdcard, hcClient);
    }

    /**
     * 护照识别
     *
     * 识别用户上传的护照首页图片中的文字信息，并返回识别的结构化结果。当前版本支持中国护照的全字段识别。外国护照支持护照下方两行国际标准化的机读码识别，并可从中提取6-7个关键字段信息。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section8)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizePassportRequest 请求对象
     * @return CompletableFuture<RecognizePassportResponse>
     */
    public CompletableFuture<RecognizePassportResponse> recognizePassportAsync(RecognizePassportRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizePassport);
    }

    /**
     * 护照识别
     *
     * 识别用户上传的护照首页图片中的文字信息，并返回识别的结构化结果。当前版本支持中国护照的全字段识别。外国护照支持护照下方两行国际标准化的机读码识别，并可从中提取6-7个关键字段信息。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section8)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizePassportRequest 请求对象
     * @return AsyncInvoker<RecognizePassportRequest, RecognizePassportResponse>
     */
    public AsyncInvoker<RecognizePassportRequest, RecognizePassportResponse> recognizePassportAsyncInvoker(
        RecognizePassportRequest request) {
        return new AsyncInvoker<RecognizePassportRequest, RecognizePassportResponse>(request, OcrMeta.recognizePassport,
            hcClient);
    }

    /**
     * 核酸检测记录识别
     *
     * 识别核酸检测记录中的文字信息，并将识别的结构化结果返回给用户。PCR，全称Polymerase chain reaction,即聚合酶链式反应。PCR-test也为大众所认知为新型冠状病毒核酸检测测试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizePcrTestRecordRequest 请求对象
     * @return CompletableFuture<RecognizePcrTestRecordResponse>
     */
    public CompletableFuture<RecognizePcrTestRecordResponse> recognizePcrTestRecordAsync(
        RecognizePcrTestRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizePcrTestRecord);
    }

    /**
     * 核酸检测记录识别
     *
     * 识别核酸检测记录中的文字信息，并将识别的结构化结果返回给用户。PCR，全称Polymerase chain reaction,即聚合酶链式反应。PCR-test也为大众所认知为新型冠状病毒核酸检测测试。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizePcrTestRecordRequest 请求对象
     * @return AsyncInvoker<RecognizePcrTestRecordRequest, RecognizePcrTestRecordResponse>
     */
    public AsyncInvoker<RecognizePcrTestRecordRequest, RecognizePcrTestRecordResponse> recognizePcrTestRecordAsyncInvoker(
        RecognizePcrTestRecordRequest request) {
        return new AsyncInvoker<RecognizePcrTestRecordRequest, RecognizePcrTestRecordResponse>(request,
            OcrMeta.recognizePcrTestRecord, hcClient);
    }

    /**
     * 道路运输从业资格证识别
     *
     * 识别道路运输从业资格证上的关键文字信息，并返回识别的结构化结果。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section25)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeQualificationCertificateRequest 请求对象
     * @return CompletableFuture<RecognizeQualificationCertificateResponse>
     */
    public CompletableFuture<RecognizeQualificationCertificateResponse> recognizeQualificationCertificateAsync(
        RecognizeQualificationCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeQualificationCertificate);
    }

    /**
     * 道路运输从业资格证识别
     *
     * 识别道路运输从业资格证上的关键文字信息，并返回识别的结构化结果。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section25)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeQualificationCertificateRequest 请求对象
     * @return AsyncInvoker<RecognizeQualificationCertificateRequest, RecognizeQualificationCertificateResponse>
     */
    public AsyncInvoker<RecognizeQualificationCertificateRequest, RecognizeQualificationCertificateResponse> recognizeQualificationCertificateAsyncInvoker(
        RecognizeQualificationCertificateRequest request) {
        return new AsyncInvoker<RecognizeQualificationCertificateRequest, RecognizeQualificationCertificateResponse>(
            request, OcrMeta.recognizeQualificationCertificate, hcClient);
    }

    /**
     * 定额发票识别
     *
     * 识别定额发票中的文字信息，并返回识别的结构化结果。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section21)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * 说明： 
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeQuotaInvoiceRequest 请求对象
     * @return CompletableFuture<RecognizeQuotaInvoiceResponse>
     */
    public CompletableFuture<RecognizeQuotaInvoiceResponse> recognizeQuotaInvoiceAsync(
        RecognizeQuotaInvoiceRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeQuotaInvoice);
    }

    /**
     * 定额发票识别
     *
     * 识别定额发票中的文字信息，并返回识别的结构化结果。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section21)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * 说明： 
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeQuotaInvoiceRequest 请求对象
     * @return AsyncInvoker<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse>
     */
    public AsyncInvoker<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse> recognizeQuotaInvoiceAsyncInvoker(
        RecognizeQuotaInvoiceRequest request) {
        return new AsyncInvoker<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse>(request,
            OcrMeta.recognizeQuotaInvoice, hcClient);
    }

    /**
     * 出租车发票识别
     *
     * 识别出租车发票中的文字信息，并返回识别的结构化结果。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section18)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeTaxiInvoiceRequest 请求对象
     * @return CompletableFuture<RecognizeTaxiInvoiceResponse>
     */
    public CompletableFuture<RecognizeTaxiInvoiceResponse> recognizeTaxiInvoiceAsync(
        RecognizeTaxiInvoiceRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeTaxiInvoice);
    }

    /**
     * 出租车发票识别
     *
     * 识别出租车发票中的文字信息，并返回识别的结构化结果。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section18)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeTaxiInvoiceRequest 请求对象
     * @return AsyncInvoker<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse>
     */
    public AsyncInvoker<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse> recognizeTaxiInvoiceAsyncInvoker(
        RecognizeTaxiInvoiceRequest request) {
        return new AsyncInvoker<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse>(request,
            OcrMeta.recognizeTaxiInvoice, hcClient);
    }

    /**
     * 泰文身份证识别
     *
     * 识别泰国身份证中的文字信息，并返回识别的结构化结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeThailandIdcardRequest 请求对象
     * @return CompletableFuture<RecognizeThailandIdcardResponse>
     */
    public CompletableFuture<RecognizeThailandIdcardResponse> recognizeThailandIdcardAsync(
        RecognizeThailandIdcardRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeThailandIdcard);
    }

    /**
     * 泰文身份证识别
     *
     * 识别泰国身份证中的文字信息，并返回识别的结构化结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeThailandIdcardRequest 请求对象
     * @return AsyncInvoker<RecognizeThailandIdcardRequest, RecognizeThailandIdcardResponse>
     */
    public AsyncInvoker<RecognizeThailandIdcardRequest, RecognizeThailandIdcardResponse> recognizeThailandIdcardAsyncInvoker(
        RecognizeThailandIdcardRequest request) {
        return new AsyncInvoker<RecognizeThailandIdcardRequest, RecognizeThailandIdcardResponse>(request,
            OcrMeta.recognizeThailandIdcard, hcClient);
    }

    /**
     * 泰国车牌识别
     *
     * 识别泰国车牌图片中的车牌信息，并返回识别的结构化结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeThailandLicensePlateRequest 请求对象
     * @return CompletableFuture<RecognizeThailandLicensePlateResponse>
     */
    public CompletableFuture<RecognizeThailandLicensePlateResponse> recognizeThailandLicensePlateAsync(
        RecognizeThailandLicensePlateRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeThailandLicensePlate);
    }

    /**
     * 泰国车牌识别
     *
     * 识别泰国车牌图片中的车牌信息，并返回识别的结构化结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeThailandLicensePlateRequest 请求对象
     * @return AsyncInvoker<RecognizeThailandLicensePlateRequest, RecognizeThailandLicensePlateResponse>
     */
    public AsyncInvoker<RecognizeThailandLicensePlateRequest, RecognizeThailandLicensePlateResponse> recognizeThailandLicensePlateAsyncInvoker(
        RecognizeThailandLicensePlateRequest request) {
        return new AsyncInvoker<RecognizeThailandLicensePlateRequest, RecognizeThailandLicensePlateResponse>(request,
            OcrMeta.recognizeThailandLicensePlate, hcClient);
    }

    /**
     * 车辆通行费发票识别
     *
     * 识别车辆通行费发票中的文字信息，并返回识别的结构化结果。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section19)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeTollInvoiceRequest 请求对象
     * @return CompletableFuture<RecognizeTollInvoiceResponse>
     */
    public CompletableFuture<RecognizeTollInvoiceResponse> recognizeTollInvoiceAsync(
        RecognizeTollInvoiceRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeTollInvoice);
    }

    /**
     * 车辆通行费发票识别
     *
     * 识别车辆通行费发票中的文字信息，并返回识别的结构化结果。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section19)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeTollInvoiceRequest 请求对象
     * @return AsyncInvoker<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse>
     */
    public AsyncInvoker<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse> recognizeTollInvoiceAsyncInvoker(
        RecognizeTollInvoiceRequest request) {
        return new AsyncInvoker<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse>(request,
            OcrMeta.recognizeTollInvoice, hcClient);
    }

    /**
     * 火车票识别
     *
     * 识别火车票中的文字信息，并返回识别的结构化结果。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section22)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeTrainTicketRequest 请求对象
     * @return CompletableFuture<RecognizeTrainTicketResponse>
     */
    public CompletableFuture<RecognizeTrainTicketResponse> recognizeTrainTicketAsync(
        RecognizeTrainTicketRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeTrainTicket);
    }

    /**
     * 火车票识别
     *
     * 识别火车票中的文字信息，并返回识别的结构化结果。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section22)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeTrainTicketRequest 请求对象
     * @return AsyncInvoker<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse>
     */
    public AsyncInvoker<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse> recognizeTrainTicketAsyncInvoker(
        RecognizeTrainTicketRequest request) {
        return new AsyncInvoker<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse>(request,
            OcrMeta.recognizeTrainTicket, hcClient);
    }

    /**
     * 道路运输证识别
     *
     * 识别道路运输证首页中的文字信息，并返回识别的结构化结果。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section11)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 说明： 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeTransportationLicenseRequest 请求对象
     * @return CompletableFuture<RecognizeTransportationLicenseResponse>
     */
    public CompletableFuture<RecognizeTransportationLicenseResponse> recognizeTransportationLicenseAsync(
        RecognizeTransportationLicenseRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeTransportationLicense);
    }

    /**
     * 道路运输证识别
     *
     * 识别道路运输证首页中的文字信息，并返回识别的结构化结果。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section11)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 说明： 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeTransportationLicenseRequest 请求对象
     * @return AsyncInvoker<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse>
     */
    public AsyncInvoker<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse> recognizeTransportationLicenseAsyncInvoker(
        RecognizeTransportationLicenseRequest request) {
        return new AsyncInvoker<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse>(request,
            OcrMeta.recognizeTransportationLicense, hcClient);
    }

    /**
     * 增值税发票识别
     *
     * 识别增值税发票的类别，以及图片中的文字内容，并以json格式返回识别的结构化结果，不支持真伪验证。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section15)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 说明：
     * 该增值税发票仅限于中华人民共和国境内使用的增值税发票。
     * 支持的增值税发票包括：增值税专用发票、增值税普通发票、增值税电子普通发票、增值税电子专用发票、增值税电子普通发票（通行费）、增值税普通发票（卷票）。
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeVatInvoiceRequest 请求对象
     * @return CompletableFuture<RecognizeVatInvoiceResponse>
     */
    public CompletableFuture<RecognizeVatInvoiceResponse> recognizeVatInvoiceAsync(RecognizeVatInvoiceRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeVatInvoice);
    }

    /**
     * 增值税发票识别
     *
     * 识别增值税发票的类别，以及图片中的文字内容，并以json格式返回识别的结构化结果，不支持真伪验证。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section15)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 说明：
     * 该增值税发票仅限于中华人民共和国境内使用的增值税发票。
     * 支持的增值税发票包括：增值税专用发票、增值税普通发票、增值税电子普通发票、增值税电子专用发票、增值税电子普通发票（通行费）、增值税普通发票（卷票）。
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeVatInvoiceRequest 请求对象
     * @return AsyncInvoker<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse>
     */
    public AsyncInvoker<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse> recognizeVatInvoiceAsyncInvoker(
        RecognizeVatInvoiceRequest request) {
        return new AsyncInvoker<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse>(request,
            OcrMeta.recognizeVatInvoice, hcClient);
    }

    /**
     * 行驶证识别
     *
     * 识别用户上传的行驶证图片（或者用户提供的华为云上OBS的行驶证图片文件的URL）中主页和副页的文字内容，并将识别的结果返回给用户。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section7)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeVehicleLicenseRequest 请求对象
     * @return CompletableFuture<RecognizeVehicleLicenseResponse>
     */
    public CompletableFuture<RecognizeVehicleLicenseResponse> recognizeVehicleLicenseAsync(
        RecognizeVehicleLicenseRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeVehicleLicense);
    }

    /**
     * 行驶证识别
     *
     * 识别用户上传的行驶证图片（或者用户提供的华为云上OBS的行驶证图片文件的URL）中主页和副页的文字内容，并将识别的结果返回给用户。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section7)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 说明：
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeVehicleLicenseRequest 请求对象
     * @return AsyncInvoker<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse>
     */
    public AsyncInvoker<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse> recognizeVehicleLicenseAsyncInvoker(
        RecognizeVehicleLicenseRequest request) {
        return new AsyncInvoker<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse>(request,
            OcrMeta.recognizeVehicleLicense, hcClient);
    }

    /**
     * 电子面单识别
     *
     * 识别用户上传的韵达电子面单图片中的文字内容，并将识别的结果以json格式返回给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeWaybillElectronicRequest 请求对象
     * @return CompletableFuture<RecognizeWaybillElectronicResponse>
     */
    public CompletableFuture<RecognizeWaybillElectronicResponse> recognizeWaybillElectronicAsync(
        RecognizeWaybillElectronicRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeWaybillElectronic);
    }

    /**
     * 电子面单识别
     *
     * 识别用户上传的韵达电子面单图片中的文字内容，并将识别的结果以json格式返回给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeWaybillElectronicRequest 请求对象
     * @return AsyncInvoker<RecognizeWaybillElectronicRequest, RecognizeWaybillElectronicResponse>
     */
    public AsyncInvoker<RecognizeWaybillElectronicRequest, RecognizeWaybillElectronicResponse> recognizeWaybillElectronicAsyncInvoker(
        RecognizeWaybillElectronicRequest request) {
        return new AsyncInvoker<RecognizeWaybillElectronicRequest, RecognizeWaybillElectronicResponse>(request,
            OcrMeta.recognizeWaybillElectronic, hcClient);
    }

    /**
     * 网络图片识别
     *
     * 识别网络图片中的文字内容，并返回识别的结构化结果。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section2)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeWebImageRequest 请求对象
     * @return CompletableFuture<RecognizeWebImageResponse>
     */
    public CompletableFuture<RecognizeWebImageResponse> recognizeWebImageAsync(RecognizeWebImageRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeWebImage);
    }

    /**
     * 网络图片识别
     *
     * 识别网络图片中的文字内容，并返回识别的结构化结果。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section2)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeWebImageRequest 请求对象
     * @return AsyncInvoker<RecognizeWebImageRequest, RecognizeWebImageResponse>
     */
    public AsyncInvoker<RecognizeWebImageRequest, RecognizeWebImageResponse> recognizeWebImageAsyncInvoker(
        RecognizeWebImageRequest request) {
        return new AsyncInvoker<RecognizeWebImageRequest, RecognizeWebImageResponse>(request, OcrMeta.recognizeWebImage,
            hcClient);
    }

    /**
     * 自定义模板OCR
     *
     * 自定义模板OCR，支持用户自定义模板，对于版式固定的各种票据和卡证，通过可视化界面操作，指定需要识别的关键字段，实现用户特定格式图片的自动识别和结构化提取。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeCustomTemplateRequest 请求对象
     * @return CompletableFuture<RecognizeCustomTemplateResponse>
     */
    public CompletableFuture<RecognizeCustomTemplateResponse> recognizeCustomTemplateAsync(
        RecognizeCustomTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeCustomTemplate);
    }

    /**
     * 自定义模板OCR
     *
     * 自定义模板OCR，支持用户自定义模板，对于版式固定的各种票据和卡证，通过可视化界面操作，指定需要识别的关键字段，实现用户特定格式图片的自动识别和结构化提取。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeCustomTemplateRequest 请求对象
     * @return AsyncInvoker<RecognizeCustomTemplateRequest, RecognizeCustomTemplateResponse>
     */
    public AsyncInvoker<RecognizeCustomTemplateRequest, RecognizeCustomTemplateResponse> recognizeCustomTemplateAsyncInvoker(
        RecognizeCustomTemplateRequest request) {
        return new AsyncInvoker<RecognizeCustomTemplateRequest, RecognizeCustomTemplateResponse>(request,
            OcrMeta.recognizeCustomTemplate, hcClient);
    }

    /**
     * VIN码识别
     *
     * 识别图片中的车架号信息，并将识别结果返回给用户。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section14)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeVinRequest 请求对象
     * @return CompletableFuture<RecognizeVinResponse>
     */
    public CompletableFuture<RecognizeVinResponse> recognizeVinAsync(RecognizeVinRequest request) {
        return hcClient.asyncInvokeHttp(request, OcrMeta.recognizeVin);
    }

    /**
     * VIN码识别
     *
     * 识别图片中的车架号信息，并将识别结果返回给用户。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html#section14)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RecognizeVinRequest 请求对象
     * @return AsyncInvoker<RecognizeVinRequest, RecognizeVinResponse>
     */
    public AsyncInvoker<RecognizeVinRequest, RecognizeVinResponse> recognizeVinAsyncInvoker(
        RecognizeVinRequest request) {
        return new AsyncInvoker<RecognizeVinRequest, RecognizeVinResponse>(request, OcrMeta.recognizeVin, hcClient);
    }

}
