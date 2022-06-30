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

    /**
     * 智能分类识别
     *
     * 检测定位图片上指定要识别的票证（票据、证件或其他文字载体），并对其进行结构化识别。接口以列表形式返回图片上要识别票证的位置坐标、结构化识别的内容以及对应的类别。
     * 
     * 计费次数说明：
     * 
     * 只对识别成功的票证进行计费，识别失败的票证不计费。例如图片中包含三张票证，有两张识别成功，一张识别失败，此时接口计费两次。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeAutoClassificationRequest 请求对象
     * @return RecognizeAutoClassificationResponse
     */
    public RecognizeAutoClassificationResponse recognizeAutoClassification(RecognizeAutoClassificationRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeAutoClassification);
    }

    /**
     * 智能分类识别
     *
     * 检测定位图片上指定要识别的票证（票据、证件或其他文字载体），并对其进行结构化识别。接口以列表形式返回图片上要识别票证的位置坐标、结构化识别的内容以及对应的类别。
     * 
     * 计费次数说明：
     * 
     * 只对识别成功的票证进行计费，识别失败的票证不计费。例如图片中包含三张票证，有两张识别成功，一张识别失败，此时接口计费两次。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeAutoClassificationRequest 请求对象
     * @return SyncInvoker<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse>
     */
    public SyncInvoker<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse> recognizeAutoClassificationInvoker(
        RecognizeAutoClassificationRequest request) {
        return new SyncInvoker<RecognizeAutoClassificationRequest, RecognizeAutoClassificationResponse>(request,
            OcrMeta.recognizeAutoClassification, hcClient);
    }

    /**
     * 银行卡识别
     *
     * 识别银行卡上的关键文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeBankcardRequest 请求对象
     * @return RecognizeBankcardResponse
     */
    public RecognizeBankcardResponse recognizeBankcard(RecognizeBankcardRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeBankcard);
    }

    /**
     * 银行卡识别
     *
     * 识别银行卡上的关键文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeBankcardRequest 请求对象
     * @return SyncInvoker<RecognizeBankcardRequest, RecognizeBankcardResponse>
     */
    public SyncInvoker<RecognizeBankcardRequest, RecognizeBankcardResponse> recognizeBankcardInvoker(
        RecognizeBankcardRequest request) {
        return new SyncInvoker<RecognizeBankcardRequest, RecognizeBankcardResponse>(request, OcrMeta.recognizeBankcard,
            hcClient);
    }

    /**
     * 名片识别
     *
     * 识别名片图片上的文字信息，并返回识别的结构化结果。支持对多种不同版式名片进行结构化信息提取。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeBusinessCardRequest 请求对象
     * @return RecognizeBusinessCardResponse
     */
    public RecognizeBusinessCardResponse recognizeBusinessCard(RecognizeBusinessCardRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeBusinessCard);
    }

    /**
     * 名片识别
     *
     * 识别名片图片上的文字信息，并返回识别的结构化结果。支持对多种不同版式名片进行结构化信息提取。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeBusinessCardRequest 请求对象
     * @return SyncInvoker<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse>
     */
    public SyncInvoker<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse> recognizeBusinessCardInvoker(
        RecognizeBusinessCardRequest request) {
        return new SyncInvoker<RecognizeBusinessCardRequest, RecognizeBusinessCardResponse>(request,
            OcrMeta.recognizeBusinessCard, hcClient);
    }

    /**
     * 营业执照识别
     *
     * 识别营业执照首页图片中的文字信息，并返回识别的结构化结果。
     * 
     * 说明： 
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeBusinessLicenseRequest 请求对象
     * @return RecognizeBusinessLicenseResponse
     */
    public RecognizeBusinessLicenseResponse recognizeBusinessLicense(RecognizeBusinessLicenseRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeBusinessLicense);
    }

    /**
     * 营业执照识别
     *
     * 识别营业执照首页图片中的文字信息，并返回识别的结构化结果。
     * 
     * 说明： 
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeBusinessLicenseRequest 请求对象
     * @return SyncInvoker<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse>
     */
    public SyncInvoker<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse> recognizeBusinessLicenseInvoker(
        RecognizeBusinessLicenseRequest request) {
        return new SyncInvoker<RecognizeBusinessLicenseRequest, RecognizeBusinessLicenseResponse>(request,
            OcrMeta.recognizeBusinessLicense, hcClient);
    }

    /**
     * 柬文身份证识别
     *
     * 识别柬文身份证图片中的文字内容，并将识别的结构化结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeCambodianIdCardRequest 请求对象
     * @return RecognizeCambodianIdCardResponse
     */
    public RecognizeCambodianIdCardResponse recognizeCambodianIdCard(RecognizeCambodianIdCardRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeCambodianIdCard);
    }

    /**
     * 柬文身份证识别
     *
     * 识别柬文身份证图片中的文字内容，并将识别的结构化结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeCambodianIdCardRequest 请求对象
     * @return SyncInvoker<RecognizeCambodianIdCardRequest, RecognizeCambodianIdCardResponse>
     */
    public SyncInvoker<RecognizeCambodianIdCardRequest, RecognizeCambodianIdCardResponse> recognizeCambodianIdCardInvoker(
        RecognizeCambodianIdCardRequest request) {
        return new SyncInvoker<RecognizeCambodianIdCardRequest, RecognizeCambodianIdCardResponse>(request,
            OcrMeta.recognizeCambodianIdCard, hcClient);
    }

    /**
     * 智利身份证识别
     *
     * 识别智利身份证图片中的文字内容，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeChileIdCardRequest 请求对象
     * @return RecognizeChileIdCardResponse
     */
    public RecognizeChileIdCardResponse recognizeChileIdCard(RecognizeChileIdCardRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeChileIdCard);
    }

    /**
     * 智利身份证识别
     *
     * 识别智利身份证图片中的文字内容，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeChileIdCardRequest 请求对象
     * @return SyncInvoker<RecognizeChileIdCardRequest, RecognizeChileIdCardResponse>
     */
    public SyncInvoker<RecognizeChileIdCardRequest, RecognizeChileIdCardResponse> recognizeChileIdCardInvoker(
        RecognizeChileIdCardRequest request) {
        return new SyncInvoker<RecognizeChileIdCardRequest, RecognizeChileIdCardResponse>(request,
            OcrMeta.recognizeChileIdCard, hcClient);
    }

    /**
     * 驾驶证识别
     *
     * 识别用户上传的驾驶证图片（或者用户提供的华为云上OBS的驾驶证图片文件的URL）中主页与副页的文字内容，并将识别的结果返回给用户。
     * 
     * 说明： 
     * 
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeDriverLicenseRequest 请求对象
     * @return RecognizeDriverLicenseResponse
     */
    public RecognizeDriverLicenseResponse recognizeDriverLicense(RecognizeDriverLicenseRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeDriverLicense);
    }

    /**
     * 驾驶证识别
     *
     * 识别用户上传的驾驶证图片（或者用户提供的华为云上OBS的驾驶证图片文件的URL）中主页与副页的文字内容，并将识别的结果返回给用户。
     * 
     * 说明： 
     * 
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeDriverLicenseRequest 请求对象
     * @return SyncInvoker<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse>
     */
    public SyncInvoker<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse> recognizeDriverLicenseInvoker(
        RecognizeDriverLicenseRequest request) {
        return new SyncInvoker<RecognizeDriverLicenseRequest, RecognizeDriverLicenseResponse>(request,
            OcrMeta.recognizeDriverLicense, hcClient);
    }

    /**
     * 往来港澳台通行证识别
     *
     * 识别往来港澳台证件图片中的文字内容，并将识别的结构化结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeExitEntryPermitRequest 请求对象
     * @return RecognizeExitEntryPermitResponse
     */
    public RecognizeExitEntryPermitResponse recognizeExitEntryPermit(RecognizeExitEntryPermitRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeExitEntryPermit);
    }

    /**
     * 往来港澳台通行证识别
     *
     * 识别往来港澳台证件图片中的文字内容，并将识别的结构化结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeExitEntryPermitRequest 请求对象
     * @return SyncInvoker<RecognizeExitEntryPermitRequest, RecognizeExitEntryPermitResponse>
     */
    public SyncInvoker<RecognizeExitEntryPermitRequest, RecognizeExitEntryPermitResponse> recognizeExitEntryPermitInvoker(
        RecognizeExitEntryPermitRequest request) {
        return new SyncInvoker<RecognizeExitEntryPermitRequest, RecognizeExitEntryPermitResponse>(request,
            OcrMeta.recognizeExitEntryPermit, hcClient);
    }

    /**
     * 财务报表识别
     *
     * 识别用户上传的表格图片中的文字内容，并将识别的结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeFinancialStatementRequest 请求对象
     * @return RecognizeFinancialStatementResponse
     */
    public RecognizeFinancialStatementResponse recognizeFinancialStatement(RecognizeFinancialStatementRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeFinancialStatement);
    }

    /**
     * 财务报表识别
     *
     * 识别用户上传的表格图片中的文字内容，并将识别的结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeFinancialStatementRequest 请求对象
     * @return SyncInvoker<RecognizeFinancialStatementRequest, RecognizeFinancialStatementResponse>
     */
    public SyncInvoker<RecognizeFinancialStatementRequest, RecognizeFinancialStatementResponse> recognizeFinancialStatementInvoker(
        RecognizeFinancialStatementRequest request) {
        return new SyncInvoker<RecognizeFinancialStatementRequest, RecognizeFinancialStatementResponse>(request,
            OcrMeta.recognizeFinancialStatement, hcClient);
    }

    /**
     * 飞机行程单识别
     *
     * 识别飞机行程单中的文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeFlightItineraryRequest 请求对象
     * @return RecognizeFlightItineraryResponse
     */
    public RecognizeFlightItineraryResponse recognizeFlightItinerary(RecognizeFlightItineraryRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeFlightItinerary);
    }

    /**
     * 飞机行程单识别
     *
     * 识别飞机行程单中的文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeFlightItineraryRequest 请求对象
     * @return SyncInvoker<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse>
     */
    public SyncInvoker<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse> recognizeFlightItineraryInvoker(
        RecognizeFlightItineraryRequest request) {
        return new SyncInvoker<RecognizeFlightItineraryRequest, RecognizeFlightItineraryResponse>(request,
            OcrMeta.recognizeFlightItinerary, hcClient);
    }

    /**
     * 通用表格识别
     *
     * 识别用于识别用户上传的通用表格图片（或者用户提供的华为云上OBS的通用表格图片文件的URL）中的文字内容，并将识别的结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeGeneralTableRequest 请求对象
     * @return RecognizeGeneralTableResponse
     */
    public RecognizeGeneralTableResponse recognizeGeneralTable(RecognizeGeneralTableRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeGeneralTable);
    }

    /**
     * 通用表格识别
     *
     * 识别用于识别用户上传的通用表格图片（或者用户提供的华为云上OBS的通用表格图片文件的URL）中的文字内容，并将识别的结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeGeneralTableRequest 请求对象
     * @return SyncInvoker<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse>
     */
    public SyncInvoker<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse> recognizeGeneralTableInvoker(
        RecognizeGeneralTableRequest request) {
        return new SyncInvoker<RecognizeGeneralTableRequest, RecognizeGeneralTableResponse>(request,
            OcrMeta.recognizeGeneralTable, hcClient);
    }

    /**
     * 通用文字识别
     *
     * 识别图片上的文字信息，返回识别的文字和坐标。支持扫描文件、电子文档、书籍、票据和表单等多种场景的文字识别。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeGeneralTextRequest 请求对象
     * @return RecognizeGeneralTextResponse
     */
    public RecognizeGeneralTextResponse recognizeGeneralText(RecognizeGeneralTextRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeGeneralText);
    }

    /**
     * 通用文字识别
     *
     * 识别图片上的文字信息，返回识别的文字和坐标。支持扫描文件、电子文档、书籍、票据和表单等多种场景的文字识别。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeGeneralTextRequest 请求对象
     * @return SyncInvoker<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse>
     */
    public SyncInvoker<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse> recognizeGeneralTextInvoker(
        RecognizeGeneralTextRequest request) {
        return new SyncInvoker<RecognizeGeneralTextRequest, RecognizeGeneralTextResponse>(request,
            OcrMeta.recognizeGeneralText, hcClient);
    }

    /**
     * 手写文字识别
     *
     * 识别文档中的手写文字信息，并将识别的结构化结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeHandwritingRequest 请求对象
     * @return RecognizeHandwritingResponse
     */
    public RecognizeHandwritingResponse recognizeHandwriting(RecognizeHandwritingRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeHandwriting);
    }

    /**
     * 手写文字识别
     *
     * 识别文档中的手写文字信息，并将识别的结构化结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeHandwritingRequest 请求对象
     * @return SyncInvoker<RecognizeHandwritingRequest, RecognizeHandwritingResponse>
     */
    public SyncInvoker<RecognizeHandwritingRequest, RecognizeHandwritingResponse> recognizeHandwritingInvoker(
        RecognizeHandwritingRequest request) {
        return new SyncInvoker<RecognizeHandwritingRequest, RecognizeHandwritingResponse>(request,
            OcrMeta.recognizeHandwriting, hcClient);
    }

    /**
     * 防疫健康码识别
     *
     * 识别防疫健康码中的文字信息，并将识别的结构化结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeHealthCodeRequest 请求对象
     * @return RecognizeHealthCodeResponse
     */
    public RecognizeHealthCodeResponse recognizeHealthCode(RecognizeHealthCodeRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeHealthCode);
    }

    /**
     * 防疫健康码识别
     *
     * 识别防疫健康码中的文字信息，并将识别的结构化结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeHealthCodeRequest 请求对象
     * @return SyncInvoker<RecognizeHealthCodeRequest, RecognizeHealthCodeResponse>
     */
    public SyncInvoker<RecognizeHealthCodeRequest, RecognizeHealthCodeResponse> recognizeHealthCodeInvoker(
        RecognizeHealthCodeRequest request) {
        return new SyncInvoker<RecognizeHealthCodeRequest, RecognizeHealthCodeResponse>(request,
            OcrMeta.recognizeHealthCode, hcClient);
    }

    /**
     * 香港身份证识别
     *
     * 识别香港身份证中的文字内容，并将识别的结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeHkIdCardRequest 请求对象
     * @return RecognizeHkIdCardResponse
     */
    public RecognizeHkIdCardResponse recognizeHkIdCard(RecognizeHkIdCardRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeHkIdCard);
    }

    /**
     * 香港身份证识别
     *
     * 识别香港身份证中的文字内容，并将识别的结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeHkIdCardRequest 请求对象
     * @return SyncInvoker<RecognizeHkIdCardRequest, RecognizeHkIdCardResponse>
     */
    public SyncInvoker<RecognizeHkIdCardRequest, RecognizeHkIdCardResponse> recognizeHkIdCardInvoker(
        RecognizeHkIdCardRequest request) {
        return new SyncInvoker<RecognizeHkIdCardRequest, RecognizeHkIdCardResponse>(request, OcrMeta.recognizeHkIdCard,
            hcClient);
    }

    /**
     * 身份证识别
     *
     * 识别身份证图片中的文字内容，并将识别的结果返回给用户。
     * 
     * 说明： 
     * 
     * 身份证识别支持中华人民共和国居民身份证识别。
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeIdCardRequest 请求对象
     * @return RecognizeIdCardResponse
     */
    public RecognizeIdCardResponse recognizeIdCard(RecognizeIdCardRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeIdCard);
    }

    /**
     * 身份证识别
     *
     * 识别身份证图片中的文字内容，并将识别的结果返回给用户。
     * 
     * 说明： 
     * 
     * 身份证识别支持中华人民共和国居民身份证识别。
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeIdCardRequest 请求对象
     * @return SyncInvoker<RecognizeIdCardRequest, RecognizeIdCardResponse>
     */
    public SyncInvoker<RecognizeIdCardRequest, RecognizeIdCardResponse> recognizeIdCardInvoker(
        RecognizeIdCardRequest request) {
        return new SyncInvoker<RecognizeIdCardRequest, RecognizeIdCardResponse>(request, OcrMeta.recognizeIdCard,
            hcClient);
    }

    /**
     * 通用证件识别
     *
     * 识别身份证件图像，并将识别的结构化结果返回给用户。支持多个国家的身份证、驾驶证和护照，具体国家和证件列表详见表1。
     * 
     * **表1支持国家列表**
     * 
     * | 国家/地区  | 英文名称    | 国家代码  country_region | 支持证件类型  id_type   |
     * | ---------- | ----------- | ------------------------ | ----------------------- |
     * | 越南       | Vietnam     | VNM                      | PP、DL、ID              |
     * | 印度       | India       | IND                      | PP                      |
     * | 菲律宾     | Philippines | PHL                      | PP、DL、ID(仅支持UUMID) |
     * | 阿尔巴尼亚 | Albania     | ALB                      | PP、DL、ID              |
     * | 巴西       | BRAZIL      | BRA                      | PP                      |
     * | 印度尼西亚 | INDONESIA   | IDN                      | PP                      |
     * | 马来西亚   | MALAYSIA    | MYS                      | PP                      |
     * | 尼日利亚   | NIGERIA     | NGA                      | PP                      |
     * | 巴基斯坦   | PAKISTAN    | PAK                      | PP                      |
     * | 俄罗斯     | RUSSIA      | RUS                      | PP(仅支持国际标准版本)  |
     * | 中国台湾   | TAIWAN      | TWN                      | PP                      |
     * | 乌克兰     | UKRAINE     | UKR                      | PP                      |
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeIdDocumentRequest 请求对象
     * @return RecognizeIdDocumentResponse
     */
    public RecognizeIdDocumentResponse recognizeIdDocument(RecognizeIdDocumentRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeIdDocument);
    }

    /**
     * 通用证件识别
     *
     * 识别身份证件图像，并将识别的结构化结果返回给用户。支持多个国家的身份证、驾驶证和护照，具体国家和证件列表详见表1。
     * 
     * **表1支持国家列表**
     * 
     * | 国家/地区  | 英文名称    | 国家代码  country_region | 支持证件类型  id_type   |
     * | ---------- | ----------- | ------------------------ | ----------------------- |
     * | 越南       | Vietnam     | VNM                      | PP、DL、ID              |
     * | 印度       | India       | IND                      | PP                      |
     * | 菲律宾     | Philippines | PHL                      | PP、DL、ID(仅支持UUMID) |
     * | 阿尔巴尼亚 | Albania     | ALB                      | PP、DL、ID              |
     * | 巴西       | BRAZIL      | BRA                      | PP                      |
     * | 印度尼西亚 | INDONESIA   | IDN                      | PP                      |
     * | 马来西亚   | MALAYSIA    | MYS                      | PP                      |
     * | 尼日利亚   | NIGERIA     | NGA                      | PP                      |
     * | 巴基斯坦   | PAKISTAN    | PAK                      | PP                      |
     * | 俄罗斯     | RUSSIA      | RUS                      | PP(仅支持国际标准版本)  |
     * | 中国台湾   | TAIWAN      | TWN                      | PP                      |
     * | 乌克兰     | UKRAINE     | UKR                      | PP                      |
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeIdDocumentRequest 请求对象
     * @return SyncInvoker<RecognizeIdDocumentRequest, RecognizeIdDocumentResponse>
     */
    public SyncInvoker<RecognizeIdDocumentRequest, RecognizeIdDocumentResponse> recognizeIdDocumentInvoker(
        RecognizeIdDocumentRequest request) {
        return new SyncInvoker<RecognizeIdDocumentRequest, RecognizeIdDocumentResponse>(request,
            OcrMeta.recognizeIdDocument, hcClient);
    }

    /**
     * 保险单识别
     *
     * 识别保险单图片上的文字信息，并将识别的结构化结果返回给用户。支持对多板式保险单的扫描图片及手机照片进行结构化信息提取。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeInsurancePolicyRequest 请求对象
     * @return RecognizeInsurancePolicyResponse
     */
    public RecognizeInsurancePolicyResponse recognizeInsurancePolicy(RecognizeInsurancePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeInsurancePolicy);
    }

    /**
     * 保险单识别
     *
     * 识别保险单图片上的文字信息，并将识别的结构化结果返回给用户。支持对多板式保险单的扫描图片及手机照片进行结构化信息提取。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeInsurancePolicyRequest 请求对象
     * @return SyncInvoker<RecognizeInsurancePolicyRequest, RecognizeInsurancePolicyResponse>
     */
    public SyncInvoker<RecognizeInsurancePolicyRequest, RecognizeInsurancePolicyResponse> recognizeInsurancePolicyInvoker(
        RecognizeInsurancePolicyRequest request) {
        return new SyncInvoker<RecognizeInsurancePolicyRequest, RecognizeInsurancePolicyResponse>(request,
            OcrMeta.recognizeInsurancePolicy, hcClient);
    }

    /**
     * 发票验真
     *
     * 发票验真服务支持9种增值税发票的信息核验，包括增值税专用发票、增值税普通发票、增值税普通发票（卷式）、增值税电子专用发票、增值税电子普通发票、增值税电子普通发票（通行费）、二手车销售统一发票、机动车销售统一发票、区块链电子发票，支持返回票面的全部信息。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeInvoiceVerificationRequest 请求对象
     * @return RecognizeInvoiceVerificationResponse
     */
    public RecognizeInvoiceVerificationResponse recognizeInvoiceVerification(
        RecognizeInvoiceVerificationRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeInvoiceVerification);
    }

    /**
     * 发票验真
     *
     * 发票验真服务支持9种增值税发票的信息核验，包括增值税专用发票、增值税普通发票、增值税普通发票（卷式）、增值税电子专用发票、增值税电子普通发票、增值税电子普通发票（通行费）、二手车销售统一发票、机动车销售统一发票、区块链电子发票，支持返回票面的全部信息。该接口的使用限制请参见[约束与限制](https://support.huaweicloud.com/productdesc-ocr/ocr_01_0006.html)，详细使用指导请参见[OCR服务使用简介](https://support.huaweicloud.com/qs-ocr/ocr_05_0001.html)章节。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeInvoiceVerificationRequest 请求对象
     * @return SyncInvoker<RecognizeInvoiceVerificationRequest, RecognizeInvoiceVerificationResponse>
     */
    public SyncInvoker<RecognizeInvoiceVerificationRequest, RecognizeInvoiceVerificationResponse> recognizeInvoiceVerificationInvoker(
        RecognizeInvoiceVerificationRequest request) {
        return new SyncInvoker<RecognizeInvoiceVerificationRequest, RecognizeInvoiceVerificationResponse>(request,
            OcrMeta.recognizeInvoiceVerification, hcClient);
    }

    /**
     * 车牌识别
     *
     * 识别输入图片中的车牌信息，并返回其坐标和内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeLicensePlateRequest 请求对象
     * @return RecognizeLicensePlateResponse
     */
    public RecognizeLicensePlateResponse recognizeLicensePlate(RecognizeLicensePlateRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeLicensePlate);
    }

    /**
     * 车牌识别
     *
     * 识别输入图片中的车牌信息，并返回其坐标和内容。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeLicensePlateRequest 请求对象
     * @return SyncInvoker<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse>
     */
    public SyncInvoker<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse> recognizeLicensePlateInvoker(
        RecognizeLicensePlateRequest request) {
        return new SyncInvoker<RecognizeLicensePlateRequest, RecognizeLicensePlateResponse>(request,
            OcrMeta.recognizeLicensePlate, hcClient);
    }

    /**
     * 港澳台居民来往内地通行证识别
     *
     * 识别港澳居民来往内地通行证上的文字内容，并将识别的结构化结果返回给用户。支持港澳居民来往内地通行证和台湾居民来往内地通行证两种卡证。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeMainlandTravelPermitRequest 请求对象
     * @return RecognizeMainlandTravelPermitResponse
     */
    public RecognizeMainlandTravelPermitResponse recognizeMainlandTravelPermit(
        RecognizeMainlandTravelPermitRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeMainlandTravelPermit);
    }

    /**
     * 港澳台居民来往内地通行证识别
     *
     * 识别港澳居民来往内地通行证上的文字内容，并将识别的结构化结果返回给用户。支持港澳居民来往内地通行证和台湾居民来往内地通行证两种卡证。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeMainlandTravelPermitRequest 请求对象
     * @return SyncInvoker<RecognizeMainlandTravelPermitRequest, RecognizeMainlandTravelPermitResponse>
     */
    public SyncInvoker<RecognizeMainlandTravelPermitRequest, RecognizeMainlandTravelPermitResponse> recognizeMainlandTravelPermitInvoker(
        RecognizeMainlandTravelPermitRequest request) {
        return new SyncInvoker<RecognizeMainlandTravelPermitRequest, RecognizeMainlandTravelPermitResponse>(request,
            OcrMeta.recognizeMainlandTravelPermit, hcClient);
    }

    /**
     * 机动车销售发票识别
     *
     * 识别机动车销售发票图片中的文字内容，并将识别的结果返回给用户。
     * 
     * 说明：
     * 
     * 该增值税发票仅限于中华人民共和国境内使用的增值税发票。
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeMvsInvoiceRequest 请求对象
     * @return RecognizeMvsInvoiceResponse
     */
    public RecognizeMvsInvoiceResponse recognizeMvsInvoice(RecognizeMvsInvoiceRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeMvsInvoice);
    }

    /**
     * 机动车销售发票识别
     *
     * 识别机动车销售发票图片中的文字内容，并将识别的结果返回给用户。
     * 
     * 说明：
     * 
     * 该增值税发票仅限于中华人民共和国境内使用的增值税发票。
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeMvsInvoiceRequest 请求对象
     * @return SyncInvoker<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse>
     */
    public SyncInvoker<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse> recognizeMvsInvoiceInvoker(
        RecognizeMvsInvoiceRequest request) {
        return new SyncInvoker<RecognizeMvsInvoiceRequest, RecognizeMvsInvoiceResponse>(request,
            OcrMeta.recognizeMvsInvoice, hcClient);
    }

    /**
     * 缅文驾驶证识别
     *
     * 识别缅甸驾驶证中的文字信息，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeMyanmarDriverLicenseRequest 请求对象
     * @return RecognizeMyanmarDriverLicenseResponse
     */
    public RecognizeMyanmarDriverLicenseResponse recognizeMyanmarDriverLicense(
        RecognizeMyanmarDriverLicenseRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeMyanmarDriverLicense);
    }

    /**
     * 缅文驾驶证识别
     *
     * 识别缅甸驾驶证中的文字信息，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeMyanmarDriverLicenseRequest 请求对象
     * @return SyncInvoker<RecognizeMyanmarDriverLicenseRequest, RecognizeMyanmarDriverLicenseResponse>
     */
    public SyncInvoker<RecognizeMyanmarDriverLicenseRequest, RecognizeMyanmarDriverLicenseResponse> recognizeMyanmarDriverLicenseInvoker(
        RecognizeMyanmarDriverLicenseRequest request) {
        return new SyncInvoker<RecognizeMyanmarDriverLicenseRequest, RecognizeMyanmarDriverLicenseResponse>(request,
            OcrMeta.recognizeMyanmarDriverLicense, hcClient);
    }

    /**
     * 缅文身份证识别
     *
     * 识别缅文身份证中的文字信息，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeMyanmarIdcardRequest 请求对象
     * @return RecognizeMyanmarIdcardResponse
     */
    public RecognizeMyanmarIdcardResponse recognizeMyanmarIdcard(RecognizeMyanmarIdcardRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeMyanmarIdcard);
    }

    /**
     * 缅文身份证识别
     *
     * 识别缅文身份证中的文字信息，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeMyanmarIdcardRequest 请求对象
     * @return SyncInvoker<RecognizeMyanmarIdcardRequest, RecognizeMyanmarIdcardResponse>
     */
    public SyncInvoker<RecognizeMyanmarIdcardRequest, RecognizeMyanmarIdcardResponse> recognizeMyanmarIdcardInvoker(
        RecognizeMyanmarIdcardRequest request) {
        return new SyncInvoker<RecognizeMyanmarIdcardRequest, RecognizeMyanmarIdcardResponse>(request,
            OcrMeta.recognizeMyanmarIdcard, hcClient);
    }

    /**
     * 护照识别
     *
     * 识别用户上传的护照首页图片中的文字信息，并返回识别的结构化结果。当前版本支持中国护照的全字段识别。外国护照支持护照下方两行国际标准化的机读码识别，并可从中提取6-7个关键字段信息。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizePassportRequest 请求对象
     * @return RecognizePassportResponse
     */
    public RecognizePassportResponse recognizePassport(RecognizePassportRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizePassport);
    }

    /**
     * 护照识别
     *
     * 识别用户上传的护照首页图片中的文字信息，并返回识别的结构化结果。当前版本支持中国护照的全字段识别。外国护照支持护照下方两行国际标准化的机读码识别，并可从中提取6-7个关键字段信息。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizePassportRequest 请求对象
     * @return SyncInvoker<RecognizePassportRequest, RecognizePassportResponse>
     */
    public SyncInvoker<RecognizePassportRequest, RecognizePassportResponse> recognizePassportInvoker(
        RecognizePassportRequest request) {
        return new SyncInvoker<RecognizePassportRequest, RecognizePassportResponse>(request, OcrMeta.recognizePassport,
            hcClient);
    }

    /**
     * 核酸检测记录识别
     *
     * 识别核酸检测记录中的文字信息，并将识别的结构化结果返回给用户。PCR，全称Polymerase chain reaction,即聚合酶链式反应.PCR-test也为大众所认知为新型冠状病毒核酸检测测试。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizePcrTestRecordRequest 请求对象
     * @return RecognizePcrTestRecordResponse
     */
    public RecognizePcrTestRecordResponse recognizePcrTestRecord(RecognizePcrTestRecordRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizePcrTestRecord);
    }

    /**
     * 核酸检测记录识别
     *
     * 识别核酸检测记录中的文字信息，并将识别的结构化结果返回给用户。PCR，全称Polymerase chain reaction,即聚合酶链式反应.PCR-test也为大众所认知为新型冠状病毒核酸检测测试。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizePcrTestRecordRequest 请求对象
     * @return SyncInvoker<RecognizePcrTestRecordRequest, RecognizePcrTestRecordResponse>
     */
    public SyncInvoker<RecognizePcrTestRecordRequest, RecognizePcrTestRecordResponse> recognizePcrTestRecordInvoker(
        RecognizePcrTestRecordRequest request) {
        return new SyncInvoker<RecognizePcrTestRecordRequest, RecognizePcrTestRecordResponse>(request,
            OcrMeta.recognizePcrTestRecord, hcClient);
    }

    /**
     * 从业资格证识别
     *
     * 识别道路运输从业资格证上的关键文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeQualificationCertificateRequest 请求对象
     * @return RecognizeQualificationCertificateResponse
     */
    public RecognizeQualificationCertificateResponse recognizeQualificationCertificate(
        RecognizeQualificationCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeQualificationCertificate);
    }

    /**
     * 从业资格证识别
     *
     * 识别道路运输从业资格证上的关键文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeQualificationCertificateRequest 请求对象
     * @return SyncInvoker<RecognizeQualificationCertificateRequest, RecognizeQualificationCertificateResponse>
     */
    public SyncInvoker<RecognizeQualificationCertificateRequest, RecognizeQualificationCertificateResponse> recognizeQualificationCertificateInvoker(
        RecognizeQualificationCertificateRequest request) {
        return new SyncInvoker<RecognizeQualificationCertificateRequest, RecognizeQualificationCertificateResponse>(
            request, OcrMeta.recognizeQualificationCertificate, hcClient);
    }

    /**
     * 定额发票识别
     *
     * 识别定额发票中的文字信息，并返回识别的结构化结果。
     * 
     * 说明： 
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeQuotaInvoiceRequest 请求对象
     * @return RecognizeQuotaInvoiceResponse
     */
    public RecognizeQuotaInvoiceResponse recognizeQuotaInvoice(RecognizeQuotaInvoiceRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeQuotaInvoice);
    }

    /**
     * 定额发票识别
     *
     * 识别定额发票中的文字信息，并返回识别的结构化结果。
     * 
     * 说明： 
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeQuotaInvoiceRequest 请求对象
     * @return SyncInvoker<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse>
     */
    public SyncInvoker<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse> recognizeQuotaInvoiceInvoker(
        RecognizeQuotaInvoiceRequest request) {
        return new SyncInvoker<RecognizeQuotaInvoiceRequest, RecognizeQuotaInvoiceResponse>(request,
            OcrMeta.recognizeQuotaInvoice, hcClient);
    }

    /**
     * 出租车发票识别
     *
     * 识别出租车发票中的文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeTaxiInvoiceRequest 请求对象
     * @return RecognizeTaxiInvoiceResponse
     */
    public RecognizeTaxiInvoiceResponse recognizeTaxiInvoice(RecognizeTaxiInvoiceRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeTaxiInvoice);
    }

    /**
     * 出租车发票识别
     *
     * 识别出租车发票中的文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeTaxiInvoiceRequest 请求对象
     * @return SyncInvoker<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse>
     */
    public SyncInvoker<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse> recognizeTaxiInvoiceInvoker(
        RecognizeTaxiInvoiceRequest request) {
        return new SyncInvoker<RecognizeTaxiInvoiceRequest, RecognizeTaxiInvoiceResponse>(request,
            OcrMeta.recognizeTaxiInvoice, hcClient);
    }

    /**
     * 泰文身份证识别
     *
     * 识别泰国身份证中的文字信息，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeThailandIdcardRequest 请求对象
     * @return RecognizeThailandIdcardResponse
     */
    public RecognizeThailandIdcardResponse recognizeThailandIdcard(RecognizeThailandIdcardRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeThailandIdcard);
    }

    /**
     * 泰文身份证识别
     *
     * 识别泰国身份证中的文字信息，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeThailandIdcardRequest 请求对象
     * @return SyncInvoker<RecognizeThailandIdcardRequest, RecognizeThailandIdcardResponse>
     */
    public SyncInvoker<RecognizeThailandIdcardRequest, RecognizeThailandIdcardResponse> recognizeThailandIdcardInvoker(
        RecognizeThailandIdcardRequest request) {
        return new SyncInvoker<RecognizeThailandIdcardRequest, RecognizeThailandIdcardResponse>(request,
            OcrMeta.recognizeThailandIdcard, hcClient);
    }

    /**
     * 泰国车牌识别
     *
     * 识别泰国车牌图片中的车牌信息，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeThailandLicensePlateRequest 请求对象
     * @return RecognizeThailandLicensePlateResponse
     */
    public RecognizeThailandLicensePlateResponse recognizeThailandLicensePlate(
        RecognizeThailandLicensePlateRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeThailandLicensePlate);
    }

    /**
     * 泰国车牌识别
     *
     * 识别泰国车牌图片中的车牌信息，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeThailandLicensePlateRequest 请求对象
     * @return SyncInvoker<RecognizeThailandLicensePlateRequest, RecognizeThailandLicensePlateResponse>
     */
    public SyncInvoker<RecognizeThailandLicensePlateRequest, RecognizeThailandLicensePlateResponse> recognizeThailandLicensePlateInvoker(
        RecognizeThailandLicensePlateRequest request) {
        return new SyncInvoker<RecognizeThailandLicensePlateRequest, RecognizeThailandLicensePlateResponse>(request,
            OcrMeta.recognizeThailandLicensePlate, hcClient);
    }

    /**
     * 车辆通行费发票识别
     *
     * 识别车辆通行费发票中的文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeTollInvoiceRequest 请求对象
     * @return RecognizeTollInvoiceResponse
     */
    public RecognizeTollInvoiceResponse recognizeTollInvoice(RecognizeTollInvoiceRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeTollInvoice);
    }

    /**
     * 车辆通行费发票识别
     *
     * 识别车辆通行费发票中的文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeTollInvoiceRequest 请求对象
     * @return SyncInvoker<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse>
     */
    public SyncInvoker<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse> recognizeTollInvoiceInvoker(
        RecognizeTollInvoiceRequest request) {
        return new SyncInvoker<RecognizeTollInvoiceRequest, RecognizeTollInvoiceResponse>(request,
            OcrMeta.recognizeTollInvoice, hcClient);
    }

    /**
     * 火车票识别
     *
     * 识别火车票中的文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeTrainTicketRequest 请求对象
     * @return RecognizeTrainTicketResponse
     */
    public RecognizeTrainTicketResponse recognizeTrainTicket(RecognizeTrainTicketRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeTrainTicket);
    }

    /**
     * 火车票识别
     *
     * 识别火车票中的文字信息，并返回识别的结构化结果。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用[智能分类识别](https://apiexplorer.developer.huaweicloud.com/apiexplorer/doc?product&#x3D;OCR&amp;api&#x3D;AutoClassification)服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeTrainTicketRequest 请求对象
     * @return SyncInvoker<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse>
     */
    public SyncInvoker<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse> recognizeTrainTicketInvoker(
        RecognizeTrainTicketRequest request) {
        return new SyncInvoker<RecognizeTrainTicketRequest, RecognizeTrainTicketResponse>(request,
            OcrMeta.recognizeTrainTicket, hcClient);
    }

    /**
     * 道路运输证识别
     *
     * 识别道路运输证首页中的文字信息，并返回识别的结构化结果。
     * 
     * 说明： 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeTransportationLicenseRequest 请求对象
     * @return RecognizeTransportationLicenseResponse
     */
    public RecognizeTransportationLicenseResponse recognizeTransportationLicense(
        RecognizeTransportationLicenseRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeTransportationLicense);
    }

    /**
     * 道路运输证识别
     *
     * 识别道路运输证首页中的文字信息，并返回识别的结构化结果。
     * 
     * 说明： 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeTransportationLicenseRequest 请求对象
     * @return SyncInvoker<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse>
     */
    public SyncInvoker<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse> recognizeTransportationLicenseInvoker(
        RecognizeTransportationLicenseRequest request) {
        return new SyncInvoker<RecognizeTransportationLicenseRequest, RecognizeTransportationLicenseResponse>(request,
            OcrMeta.recognizeTransportationLicense, hcClient);
    }

    /**
     * 增值税发票识别
     *
     * 识别用户上传的增值税发票图片（或者用户提供的华为云上OBS的增值税发票图片文件的URL）中的文字内容，并将识别的结果返回给用户。
     * 
     * 说明：
     * 
     * 该增值税发票仅限于中华人民共和国境内使用的增值税发票。
     * 
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeVatInvoiceRequest 请求对象
     * @return RecognizeVatInvoiceResponse
     */
    public RecognizeVatInvoiceResponse recognizeVatInvoice(RecognizeVatInvoiceRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeVatInvoice);
    }

    /**
     * 增值税发票识别
     *
     * 识别用户上传的增值税发票图片（或者用户提供的华为云上OBS的增值税发票图片文件的URL）中的文字内容，并将识别的结果返回给用户。
     * 
     * 说明：
     * 
     * 该增值税发票仅限于中华人民共和国境内使用的增值税发票。
     * 
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeVatInvoiceRequest 请求对象
     * @return SyncInvoker<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse>
     */
    public SyncInvoker<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse> recognizeVatInvoiceInvoker(
        RecognizeVatInvoiceRequest request) {
        return new SyncInvoker<RecognizeVatInvoiceRequest, RecognizeVatInvoiceResponse>(request,
            OcrMeta.recognizeVatInvoice, hcClient);
    }

    /**
     * 行驶证识别
     *
     * 识别用户上传的行驶证图片（或者用户提供的华为云上OBS的行驶证图片文件的URL）中主页和副页的文字内容，并将识别的结果返回给用户。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeVehicleLicenseRequest 请求对象
     * @return RecognizeVehicleLicenseResponse
     */
    public RecognizeVehicleLicenseResponse recognizeVehicleLicense(RecognizeVehicleLicenseRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeVehicleLicense);
    }

    /**
     * 行驶证识别
     *
     * 识别用户上传的行驶证图片（或者用户提供的华为云上OBS的行驶证图片文件的URL）中主页和副页的文字内容，并将识别的结果返回给用户。
     * 
     * 说明：
     * 
     * 如果图片中包含多张卡证票据，请调用智能分类识别服务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeVehicleLicenseRequest 请求对象
     * @return SyncInvoker<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse>
     */
    public SyncInvoker<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse> recognizeVehicleLicenseInvoker(
        RecognizeVehicleLicenseRequest request) {
        return new SyncInvoker<RecognizeVehicleLicenseRequest, RecognizeVehicleLicenseResponse>(request,
            OcrMeta.recognizeVehicleLicense, hcClient);
    }

    /**
     * 电子面单识别
     *
     * 识别用户上传的韵达电子面单图片中的文字内容，并将识别的结果以json格式返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeWaybillElectronicRequest 请求对象
     * @return RecognizeWaybillElectronicResponse
     */
    public RecognizeWaybillElectronicResponse recognizeWaybillElectronic(RecognizeWaybillElectronicRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeWaybillElectronic);
    }

    /**
     * 电子面单识别
     *
     * 识别用户上传的韵达电子面单图片中的文字内容，并将识别的结果以json格式返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeWaybillElectronicRequest 请求对象
     * @return SyncInvoker<RecognizeWaybillElectronicRequest, RecognizeWaybillElectronicResponse>
     */
    public SyncInvoker<RecognizeWaybillElectronicRequest, RecognizeWaybillElectronicResponse> recognizeWaybillElectronicInvoker(
        RecognizeWaybillElectronicRequest request) {
        return new SyncInvoker<RecognizeWaybillElectronicRequest, RecognizeWaybillElectronicResponse>(request,
            OcrMeta.recognizeWaybillElectronic, hcClient);
    }

    /**
     * 网络图片识别
     *
     * 识别网络图片中的文字内容，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeWebImageRequest 请求对象
     * @return RecognizeWebImageResponse
     */
    public RecognizeWebImageResponse recognizeWebImage(RecognizeWebImageRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeWebImage);
    }

    /**
     * 网络图片识别
     *
     * 识别网络图片中的文字内容，并返回识别的结构化结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeWebImageRequest 请求对象
     * @return SyncInvoker<RecognizeWebImageRequest, RecognizeWebImageResponse>
     */
    public SyncInvoker<RecognizeWebImageRequest, RecognizeWebImageResponse> recognizeWebImageInvoker(
        RecognizeWebImageRequest request) {
        return new SyncInvoker<RecognizeWebImageRequest, RecognizeWebImageResponse>(request, OcrMeta.recognizeWebImage,
            hcClient);
    }

    /**
     * VIN码识别
     *
     * 识别图片中的车架号信息，并将识别结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeVinRequest 请求对象
     * @return RecognizeVinResponse
     */
    public RecognizeVinResponse recognizeVin(RecognizeVinRequest request) {
        return hcClient.syncInvokeHttp(request, OcrMeta.recognizeVin);
    }

    /**
     * VIN码识别
     *
     * 识别图片中的车架号信息，并将识别结果返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RecognizeVinRequest 请求对象
     * @return SyncInvoker<RecognizeVinRequest, RecognizeVinResponse>
     */
    public SyncInvoker<RecognizeVinRequest, RecognizeVinResponse> recognizeVinInvoker(RecognizeVinRequest request) {
        return new SyncInvoker<RecognizeVinRequest, RecognizeVinResponse>(request, OcrMeta.recognizeVin, hcClient);
    }

}
