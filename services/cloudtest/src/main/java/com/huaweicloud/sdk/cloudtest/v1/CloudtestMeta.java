package com.huaweicloud.sdk.cloudtest.v1;

import com.huaweicloud.sdk.cloudtest.v1.model.AddCaseResultFourRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.AddCaseResultFourResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.AddFeatureRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.AddFeatureResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.AddRelationsInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.AddResourceInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.AddTestCaseCommentRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.AddTestCaseCommentResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.AddTestCaseResultInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.AddTestCaseResultLogInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.AddTestCaseResultLogRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.AddTestCaseResultLogResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.AddTestItemInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.AlarmStatisticsQuery;
import com.huaweicloud.sdk.cloudtest.v1.model.AlertStatisticsDto;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchAddRelationsByOneCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchAddRelationsByOneCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchAddResourcesForIteratorRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchAddResourcesForIteratorResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteFacotrByIdsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteFacotrByIdsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCaseRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestReportRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchDeleteTestReportResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchRemoveTestCasesFromIteratorRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchRemoveTestCasesFromIteratorResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchShowTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchShowTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchUpdateVersionTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.BatchUpdateVersionTestCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.BranchVersionInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.CaseRemoveInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.CheckPermissionRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CheckPermissionResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CommRequestAssetExportParam;
import com.huaweicloud.sdk.cloudtest.v1.model.CommRequestAssetTree;
import com.huaweicloud.sdk.cloudtest.v1.model.CommRequestBackUpMindmapParam;
import com.huaweicloud.sdk.cloudtest.v1.model.CommRequestGetDefaultTemplateParam;
import com.huaweicloud.sdk.cloudtest.v1.model.CommRequestListFactorParam;
import com.huaweicloud.sdk.cloudtest.v1.model.CommRequestListString;
import com.huaweicloud.sdk.cloudtest.v1.model.CommRequestMindmapBackupPageParam;
import com.huaweicloud.sdk.cloudtest.v1.model.CommRequestMindmapPageParamV3;
import com.huaweicloud.sdk.cloudtest.v1.model.CommRequestMindmapRecyclePageParam;
import com.huaweicloud.sdk.cloudtest.v1.model.CommRequestReviewPageParam;
import com.huaweicloud.sdk.cloudtest.v1.model.CommRequestSaveTemplateParam;
import com.huaweicloud.sdk.cloudtest.v1.model.CommRequestScenePageParam;
import com.huaweicloud.sdk.cloudtest.v1.model.CommRequestSystemConfig;
import com.huaweicloud.sdk.cloudtest.v1.model.CommRequestTemplatePageParam;
import com.huaweicloud.sdk.cloudtest.v1.model.CommRequestTestCasePageParam;
import com.huaweicloud.sdk.cloudtest.v1.model.CommRequestTestPointPageParam;
import com.huaweicloud.sdk.cloudtest.v1.model.CommRequestUpdateAssetTreeParam;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateApiTestSuiteByRepoFileRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateApiTestSuiteByRepoFileResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateAssetTreeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateAssetTreeResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateBackupMindmapRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateBackupMindmapResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateBasicAwReq;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateIteratorRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateIteratorResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreatePlanRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreatePlanRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.CreatePlanResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateProjectBranchRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateProjectBranchResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateRelationsByOneCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateRelationsByOneCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateReportRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateReportResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateResourceUriRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateResourceUriResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTaskDefaultResultRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTaskDefaultResultResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTemplateRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTemplateResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseInPlanRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseInPlanRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseInPlanResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseReq;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateTestSuitByRepoFileInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateUserDefinedUrlKeyWordRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateUserDefinedUrlKeyWordResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateVersionTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.CreateVersionTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DashboardDataQuery;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteAssetRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteAssetResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteAssetTreeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteAssetTreeResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteBasicAwByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteBasicAwByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteFacotrByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteFacotrByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteMindmapBackupByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteMindmapBackupByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteMindmapRecycleByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteMindmapRecycleByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteRelationsByOneCaseInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteRelationsByOneCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteRelationsByOneCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteTemplateByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteTemplateByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteTestCaseCommentRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteTestCaseCommentResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.DeleteTestCaseInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.DownloadAssetTemplateRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.DownloadAssetTemplateResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ExportFactorRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ExportFactorResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.GenerateReportInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.ImportAssetRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ImportAssetRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.ImportAssetResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ImportFactorRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ImportFactorRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.ImportFactorResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.InitExecuteTaskInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.IssueTreeInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.IteratorVersionInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.IteratorVersionsQueryInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlarmStatisticsUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlarmStatisticsUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlertGroupsByConditionRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlertGroupsByConditionRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlertGroupsByConditionResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlertTemplatesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAlertTemplatesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllBranchesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllBranchesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllConfigItemByTypeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllConfigItemByTypeRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllConfigItemByTypeResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllIteratorsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllIteratorsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAllTestCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAttachmentsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAttachmentsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAvailableConfigRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListAvailableConfigResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBasicAwInfoListSupportsSearchRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBasicAwInfoListSupportsSearchResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBasicAwRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBasicAwResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBranchesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListBranchesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListCasesStatusRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListCasesStatusResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListDomainVisibleServicesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListDomainVisibleServicesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListEnvironmentsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListEnvironmentsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListIssueTreeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListIssueTreeResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListIteratorIssueTreeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListIteratorIssueTreeResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListIteratorsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListIteratorsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListLinesUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListLinesUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListMsgInfosUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListMsgInfosUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListOwnTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListOwnTestCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListProjectFieldConfigsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListProjectFieldConfigsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListProjectTestCaseFieldsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListProjectTestCaseFieldsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListPublicLibAndAwsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListPublicLibAndAwsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListReportsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListReportsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListResourcePoolsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListResourcePoolsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListScattersUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListScattersUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListSubTaskCaseOverstockUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListSubTaskCaseOverstockUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTaskAssignCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTaskAssignCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTaskResultsDetailRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTaskResultsDetailResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTaskResultsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTaskResultsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTaskTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTaskTestCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTasksRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTasksResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseCommentsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseCommentsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseHistoriesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseHistoriesRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseHistoriesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseScriptDetailRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCaseScriptDetailResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesByIssueRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesByIssueResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestCasesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestReportsByConditionRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestReportsByConditionResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestTypesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestTypesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestcasePlansRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestcasePlansResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestcasesByProjectIssuesRelationRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListTestcasesByProjectIssuesRelationResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUsageInfosRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUsageInfosResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserDnsMappingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserDnsMappingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserPackageUsageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserPackageUsageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserPopupInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUserPopupInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUsingGetRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListUsingGetResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ListVariablesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ListVariablesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.MsgInfoQuery;
import com.huaweicloud.sdk.cloudtest.v1.model.OprReportInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.QueryCaseResultInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.QueryIssueTreeInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.QueryProjectIssuesRelationTestCasesInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.QueryRequirementsOverviewInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.QueryTaskAssignCasesInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.QueryTaskTestCasesInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.QueryTestCasesByIssueInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.QueryTestItemTreeInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.RemoveIssuesFromIteratorRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.RemoveIssuesFromIteratorResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.RemoveIssuesInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.RunTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.RunTestCaseRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.RunTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.SaveTaskSettingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.SaveTaskSettingRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.SaveTaskSettingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.SearchRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ServiceRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAllConfigValueByTypeAndKeyRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAllConfigValueByTypeAndKeyResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAllFeatureChildrenRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAllFeatureChildrenResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowApiTestcaseHistoriesRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowApiTestcaseHistoriesResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAssetRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAssetResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAssetTreeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowAssetTreeResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowBackgroundInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowBackgroundInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowBranchRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowBranchResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowCaseResultRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowCaseResultResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowConcurrencyPackageUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowConcurrencyPackageUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowDefaultTemplateByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowDefaultTemplateByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowDisclaimerRecordRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowDisclaimerRecordResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowDomainInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowDomainInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowEchoTestPackageUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowEchoTestPackageUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFactorByAssetIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFactorByAssetIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFactorByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFactorByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFeatureChildrenRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFeatureChildrenResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFreeDeclarationRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowFreeDeclarationResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIfTaskNameRepeatRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIfTaskNameRepeatResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIfUserNameRepeatRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIfUserNameRepeatResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIssuesByPlanIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIssuesByPlanIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIteratorByDefectRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIteratorByDefectResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIteratorDetailRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowIteratorDetailResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindMapByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindMapByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapBackupByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapBackupByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapBackupByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapBackupByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapCreatorNameRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapCreatorNameResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapRecycleByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapRecycleByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapRecycleByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowMindmapRecycleByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowOperationalDataCurrentMonthUsingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowOperationalDataCurrentMonthUsingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanJournalsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanJournalsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanListRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlanListResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlansRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowPlansResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowProgressRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowProgressResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowProjectDataDashboardRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowProjectDataDashboardResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowRegisterServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowRegisterServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowReportRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowReportResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowRequirementsOverviewRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowRequirementsOverviewResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowReviewByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowReviewByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowSceneByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowSceneByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowStatisticByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowStatisticByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowSystemConfigsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowSystemConfigsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTemplateByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTemplateByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTemplateByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTemplateByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseAndDefectInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseAndDefectInfoRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseAndDefectInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailV2Request;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseDetailV2Response;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseReviewsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCaseReviewsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCasesChangeStatisticsRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestCasesChangeStatisticsResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestcaseByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestcaseByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestcaseByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestcaseByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestpointByPageRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowTestpointByPageResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowUserAccessInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowUserAccessInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowUserExecuteTestCaseInfoRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowUserExecuteTestCaseInfoRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.ShowUserExecuteTestCaseInfoResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.TasksQueryInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.TestCaseCommentInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.TestCaseInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.TestCasesQueryInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.TestPlanDetail;
import com.huaweicloud.sdk.cloudtest.v1.model.TestPlanIssueDetail;
import com.huaweicloud.sdk.cloudtest.v1.model.TestPlanJournalList;
import com.huaweicloud.sdk.cloudtest.v1.model.TestReportInfoRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.TestcasePlanQueryParam;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateAssetTreeRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateAssetTreeResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateBasicAwByIdRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateBasicAwByIdResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateBasicAwReq;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateIteratorRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateIteratorResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateMindmapNameRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateMindmapNameResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateServiceRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateServiceResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseAndScriptRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseAndScriptResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseCommentRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseCommentResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseListInfo;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseResultRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseResultRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateTestCaseResultResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateUserDnsMappingRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateUserDnsMappingResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateVersionTestCaseRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UpdateVersionTestCaseResponse;
import com.huaweicloud.sdk.cloudtest.v1.model.UploadStepImgRequest;
import com.huaweicloud.sdk.cloudtest.v1.model.UploadStepImgRequestBody;
import com.huaweicloud.sdk.cloudtest.v1.model.UploadStepImgResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CloudtestMeta {

    public static final HttpRequestDef<AddCaseResultFourRequest, AddCaseResultFourResponse> addCaseResultFour =
        genForAddCaseResultFour();

    private static HttpRequestDef<AddCaseResultFourRequest, AddCaseResultFourResponse> genForAddCaseResultFour() {
        // basic
        HttpRequestDef.Builder<AddCaseResultFourRequest, AddCaseResultFourResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddCaseResultFourRequest.class, AddCaseResultFourResponse.class)
                .withName("AddCaseResultFour")
                .withUri("/v4/{project_id}/versions/{version_uri}/testcases/{case_uri}/results")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddCaseResultFourRequest::getProjectId, AddCaseResultFourRequest::setProjectId));
        builder.<String>withRequestField("version_uri",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddCaseResultFourRequest::getVersionUri, AddCaseResultFourRequest::setVersionUri));
        builder.<String>withRequestField("case_uri",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddCaseResultFourRequest::getCaseUri, AddCaseResultFourRequest::setCaseUri));
        builder.<AddTestCaseResultInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddTestCaseResultInfo.class),
            f -> f.withMarshaller(AddCaseResultFourRequest::getBody, AddCaseResultFourRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddTestCaseCommentRequest, AddTestCaseCommentResponse> addTestCaseComment =
        genForAddTestCaseComment();

    private static HttpRequestDef<AddTestCaseCommentRequest, AddTestCaseCommentResponse> genForAddTestCaseComment() {
        // basic
        HttpRequestDef.Builder<AddTestCaseCommentRequest, AddTestCaseCommentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddTestCaseCommentRequest.class, AddTestCaseCommentResponse.class)
                .withName("AddTestCaseComment")
                .withUri("/GT3KServer/v4/{project_id}/testcases/{testcase_id}/comments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddTestCaseCommentRequest::getProjectId, AddTestCaseCommentRequest::setProjectId));
        builder.<String>withRequestField("testcase_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddTestCaseCommentRequest::getTestcaseId, AddTestCaseCommentRequest::setTestcaseId));
        builder.<TestCaseCommentInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TestCaseCommentInfo.class),
            f -> f.withMarshaller(AddTestCaseCommentRequest::getBody, AddTestCaseCommentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddTestCaseResultLogRequest, AddTestCaseResultLogResponse> addTestCaseResultLog =
        genForAddTestCaseResultLog();

    private static HttpRequestDef<AddTestCaseResultLogRequest, AddTestCaseResultLogResponse> genForAddTestCaseResultLog() {
        // basic
        HttpRequestDef.Builder<AddTestCaseResultLogRequest, AddTestCaseResultLogResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddTestCaseResultLogRequest.class, AddTestCaseResultLogResponse.class)
            .withName("AddTestCaseResultLog")
            .withUri("/v4/{project_id}/versions/{version_uri}/testcases/{case_uri}/results/init")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddTestCaseResultLogRequest::getProjectId,
                AddTestCaseResultLogRequest::setProjectId));
        builder.<String>withRequestField("version_uri",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddTestCaseResultLogRequest::getVersionUri,
                AddTestCaseResultLogRequest::setVersionUri));
        builder.<String>withRequestField("case_uri",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddTestCaseResultLogRequest::getCaseUri, AddTestCaseResultLogRequest::setCaseUri));
        builder.<AddTestCaseResultLogInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddTestCaseResultLogInfo.class),
            f -> f.withMarshaller(AddTestCaseResultLogRequest::getBody, AddTestCaseResultLogRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddRelationsByOneCaseRequest, BatchAddRelationsByOneCaseResponse> batchAddRelationsByOneCase =
        genForBatchAddRelationsByOneCase();

    private static HttpRequestDef<BatchAddRelationsByOneCaseRequest, BatchAddRelationsByOneCaseResponse> genForBatchAddRelationsByOneCase() {
        // basic
        HttpRequestDef.Builder<BatchAddRelationsByOneCaseRequest, BatchAddRelationsByOneCaseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchAddRelationsByOneCaseRequest.class,
                    BatchAddRelationsByOneCaseResponse.class)
                .withName("BatchAddRelationsByOneCase")
                .withUri("/testrelation/v4/workitems/{workitem_id}/relations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workitem_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddRelationsByOneCaseRequest::getWorkitemId,
                BatchAddRelationsByOneCaseRequest::setWorkitemId));
        builder.<AddRelationsInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddRelationsInfo.class),
            f -> f.withMarshaller(BatchAddRelationsByOneCaseRequest::getBody,
                BatchAddRelationsByOneCaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddResourcesForIteratorRequest, BatchAddResourcesForIteratorResponse> batchAddResourcesForIterator =
        genForBatchAddResourcesForIterator();

    private static HttpRequestDef<BatchAddResourcesForIteratorRequest, BatchAddResourcesForIteratorResponse> genForBatchAddResourcesForIterator() {
        // basic
        HttpRequestDef.Builder<BatchAddResourcesForIteratorRequest, BatchAddResourcesForIteratorResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchAddResourcesForIteratorRequest.class,
                    BatchAddResourcesForIteratorResponse.class)
                .withName("BatchAddResourcesForIterator")
                .withUri("/GT3KServer/v4/iterators/{iterator_id}/testcases/batch-add")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("iterator_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddResourcesForIteratorRequest::getIteratorId,
                BatchAddResourcesForIteratorRequest::setIteratorId));
        builder.<AddResourceInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddResourceInfo.class),
            f -> f.withMarshaller(BatchAddResourcesForIteratorRequest::getBody,
                BatchAddResourcesForIteratorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse> batchDeleteTestCase =
        genForBatchDeleteTestCase();

    private static HttpRequestDef<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse> genForBatchDeleteTestCase() {
        // basic
        HttpRequestDef.Builder<BatchDeleteTestCaseRequest, BatchDeleteTestCaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteTestCaseRequest.class, BatchDeleteTestCaseResponse.class)
                .withName("BatchDeleteTestCase")
                .withUri("/v1/projects/{project_id}/testcases/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteTestCaseRequest::getProjectId, BatchDeleteTestCaseRequest::setProjectId));
        builder.<BatchDeleteTestCaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteTestCaseRequestBody.class),
            f -> f.withMarshaller(BatchDeleteTestCaseRequest::getBody, BatchDeleteTestCaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteTestCasesRequest, BatchDeleteTestCasesResponse> batchDeleteTestCases =
        genForBatchDeleteTestCases();

    private static HttpRequestDef<BatchDeleteTestCasesRequest, BatchDeleteTestCasesResponse> genForBatchDeleteTestCases() {
        // basic
        HttpRequestDef.Builder<BatchDeleteTestCasesRequest, BatchDeleteTestCasesResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteTestCasesRequest.class, BatchDeleteTestCasesResponse.class)
            .withName("BatchDeleteTestCases")
            .withUri("/GT3KServer/v4/testcases/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("is_async",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(BatchDeleteTestCasesRequest::getIsAsync, BatchDeleteTestCasesRequest::setIsAsync));
        builder.<DeleteTestCaseInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTestCaseInfo.class),
            f -> f.withMarshaller(BatchDeleteTestCasesRequest::getBody, BatchDeleteTestCasesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteTestReportRequest, BatchDeleteTestReportResponse> batchDeleteTestReport =
        genForBatchDeleteTestReport();

    private static HttpRequestDef<BatchDeleteTestReportRequest, BatchDeleteTestReportResponse> genForBatchDeleteTestReport() {
        // basic
        HttpRequestDef.Builder<BatchDeleteTestReportRequest, BatchDeleteTestReportResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteTestReportRequest.class, BatchDeleteTestReportResponse.class)
            .withName("BatchDeleteTestReport")
            .withUri("/testreport/v4/{project_id}/test-reports/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteTestReportRequest::getProjectId,
                BatchDeleteTestReportRequest::setProjectId));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchDeleteTestReportRequest::getBody, BatchDeleteTestReportRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRemoveTestCasesFromIteratorRequest, BatchRemoveTestCasesFromIteratorResponse> batchRemoveTestCasesFromIterator =
        genForBatchRemoveTestCasesFromIterator();

    private static HttpRequestDef<BatchRemoveTestCasesFromIteratorRequest, BatchRemoveTestCasesFromIteratorResponse> genForBatchRemoveTestCasesFromIterator() {
        // basic
        HttpRequestDef.Builder<BatchRemoveTestCasesFromIteratorRequest, BatchRemoveTestCasesFromIteratorResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    BatchRemoveTestCasesFromIteratorRequest.class,
                    BatchRemoveTestCasesFromIteratorResponse.class)
                .withName("BatchRemoveTestCasesFromIterator")
                .withUri("/GT3KServer/v4/iterators/{iterator_id}/testcases/batch-delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("iterator_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchRemoveTestCasesFromIteratorRequest::getIteratorId,
                BatchRemoveTestCasesFromIteratorRequest::setIteratorId));
        builder.<CaseRemoveInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CaseRemoveInfo.class),
            f -> f.withMarshaller(BatchRemoveTestCasesFromIteratorRequest::getBody,
                BatchRemoveTestCasesFromIteratorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateVersionTestCasesRequest, BatchUpdateVersionTestCasesResponse> batchUpdateVersionTestCases =
        genForBatchUpdateVersionTestCases();

    private static HttpRequestDef<BatchUpdateVersionTestCasesRequest, BatchUpdateVersionTestCasesResponse> genForBatchUpdateVersionTestCases() {
        // basic
        HttpRequestDef.Builder<BatchUpdateVersionTestCasesRequest, BatchUpdateVersionTestCasesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BatchUpdateVersionTestCasesRequest.class,
                    BatchUpdateVersionTestCasesResponse.class)
                .withName("BatchUpdateVersionTestCases")
                .withUri("/GT3KServer/v4/{project_id}/testcases/batch-update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateVersionTestCasesRequest::getProjectId,
                BatchUpdateVersionTestCasesRequest::setProjectId));
        builder.<UpdateTestCaseListInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTestCaseListInfo.class),
            f -> f.withMarshaller(BatchUpdateVersionTestCasesRequest::getBody,
                BatchUpdateVersionTestCasesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckPermissionRequest, CheckPermissionResponse> checkPermission =
        genForCheckPermission();

    private static HttpRequestDef<CheckPermissionRequest, CheckPermissionResponse> genForCheckPermission() {
        // basic
        HttpRequestDef.Builder<CheckPermissionRequest, CheckPermissionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckPermissionRequest.class, CheckPermissionResponse.class)
                .withName("CheckPermission")
                .withUri("/v1/{project_id}/permission/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckPermissionRequest::getProjectId, CheckPermissionRequest::setProjectId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckPermissionRequest::getId, CheckPermissionRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIteratorRequest, CreateIteratorResponse> createIterator =
        genForCreateIterator();

    private static HttpRequestDef<CreateIteratorRequest, CreateIteratorResponse> genForCreateIterator() {
        // basic
        HttpRequestDef.Builder<CreateIteratorRequest, CreateIteratorResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateIteratorRequest.class, CreateIteratorResponse.class)
                .withName("CreateIterator")
                .withUri("/GT3KServer/v4/iterators")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("branch_uri",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIteratorRequest::getBranchUri, CreateIteratorRequest::setBranchUri));
        builder.<IteratorVersionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IteratorVersionInfo.class),
            f -> f.withMarshaller(CreateIteratorRequest::getBody, CreateIteratorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePlanRequest, CreatePlanResponse> createPlan = genForCreatePlan();

    private static HttpRequestDef<CreatePlanRequest, CreatePlanResponse> genForCreatePlan() {
        // basic
        HttpRequestDef.Builder<CreatePlanRequest, CreatePlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePlanRequest.class, CreatePlanResponse.class)
                .withName("CreatePlan")
                .withUri("/v1/projects/{project_id}/plans")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlanRequest::getProjectId, CreatePlanRequest::setProjectId));
        builder.<CreatePlanRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePlanRequestBody.class),
            f -> f.withMarshaller(CreatePlanRequest::getBody, CreatePlanRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectBranchRequest, CreateProjectBranchResponse> createProjectBranch =
        genForCreateProjectBranch();

    private static HttpRequestDef<CreateProjectBranchRequest, CreateProjectBranchResponse> genForCreateProjectBranch() {
        // basic
        HttpRequestDef.Builder<CreateProjectBranchRequest, CreateProjectBranchResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProjectBranchRequest.class, CreateProjectBranchResponse.class)
                .withName("CreateProjectBranch")
                .withUri("/GT3KServer/v4/branches")
                .withContentType("application/json");

        // requests
        builder.<BranchVersionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BranchVersionInfo.class),
            f -> f.withMarshaller(CreateProjectBranchRequest::getBody, CreateProjectBranchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRelationsByOneCaseRequest, CreateRelationsByOneCaseResponse> createRelationsByOneCase =
        genForCreateRelationsByOneCase();

    private static HttpRequestDef<CreateRelationsByOneCaseRequest, CreateRelationsByOneCaseResponse> genForCreateRelationsByOneCase() {
        // basic
        HttpRequestDef.Builder<CreateRelationsByOneCaseRequest, CreateRelationsByOneCaseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateRelationsByOneCaseRequest.class, CreateRelationsByOneCaseResponse.class)
                .withName("CreateRelationsByOneCase")
                .withUri("/testrelation/v4/testcases/{case_id}/relations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRelationsByOneCaseRequest::getCaseId,
                CreateRelationsByOneCaseRequest::setCaseId));
        builder.<AddRelationsInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddRelationsInfo.class),
            f -> f.withMarshaller(CreateRelationsByOneCaseRequest::getBody, CreateRelationsByOneCaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateReportRequest, CreateReportResponse> createReport = genForCreateReport();

    private static HttpRequestDef<CreateReportRequest, CreateReportResponse> genForCreateReport() {
        // basic
        HttpRequestDef.Builder<CreateReportRequest, CreateReportResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateReportRequest.class, CreateReportResponse.class)
                .withName("CreateReport")
                .withUri("/GT3KServer/v4/{project_id}/versions/{version_id}/custom-reports")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateReportRequest::getProjectId, CreateReportRequest::setProjectId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateReportRequest::getVersionId, CreateReportRequest::setVersionId));
        builder.<OprReportInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OprReportInfo.class),
            f -> f.withMarshaller(CreateReportRequest::getBody, CreateReportRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceUriRequest, CreateResourceUriResponse> createResourceUri =
        genForCreateResourceUri();

    private static HttpRequestDef<CreateResourceUriRequest, CreateResourceUriResponse> genForCreateResourceUri() {
        // basic
        HttpRequestDef.Builder<CreateResourceUriRequest, CreateResourceUriResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResourceUriRequest.class, CreateResourceUriResponse.class)
                .withName("CreateResourceUri")
                .withUri("/GT3KServer/v4/{project_id}/resource-uri")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResourceUriRequest::getProjectId, CreateResourceUriRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateServiceRequest, CreateServiceResponse> createService =
        genForCreateService();

    private static HttpRequestDef<CreateServiceRequest, CreateServiceResponse> genForCreateService() {
        // basic
        HttpRequestDef.Builder<CreateServiceRequest, CreateServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateServiceRequest.class, CreateServiceResponse.class)
                .withName("CreateService")
                .withUri("/v1/services")
                .withContentType("application/json");

        // requests
        builder.<ServiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServiceRequestBody.class),
            f -> f.withMarshaller(CreateServiceRequest::getBody, CreateServiceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTaskDefaultResultRequest, CreateTaskDefaultResultResponse> createTaskDefaultResult =
        genForCreateTaskDefaultResult();

    private static HttpRequestDef<CreateTaskDefaultResultRequest, CreateTaskDefaultResultResponse> genForCreateTaskDefaultResult() {
        // basic
        HttpRequestDef.Builder<CreateTaskDefaultResultRequest, CreateTaskDefaultResultResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateTaskDefaultResultRequest.class, CreateTaskDefaultResultResponse.class)
            .withName("CreateTaskDefaultResult")
            .withUri("/v4/{project_id}/tasks/{task_uri}/results/init")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTaskDefaultResultRequest::getProjectId,
                CreateTaskDefaultResultRequest::setProjectId));
        builder.<String>withRequestField("task_uri",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTaskDefaultResultRequest::getTaskUri,
                CreateTaskDefaultResultRequest::setTaskUri));
        builder.<InitExecuteTaskInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InitExecuteTaskInfo.class),
            f -> f.withMarshaller(CreateTaskDefaultResultRequest::getBody, CreateTaskDefaultResultRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateTaskDefaultResultResponse::getBody, CreateTaskDefaultResultResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreateTestCaseRequest, CreateTestCaseResponse> createTestCase =
        genForCreateTestCase();

    private static HttpRequestDef<CreateTestCaseRequest, CreateTestCaseResponse> genForCreateTestCase() {
        // basic
        HttpRequestDef.Builder<CreateTestCaseRequest, CreateTestCaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTestCaseRequest.class, CreateTestCaseResponse.class)
                .withName("CreateTestCase")
                .withUri("/v1/projects/{project_id}/testcases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTestCaseRequest::getProjectId, CreateTestCaseRequest::setProjectId));
        builder.<CreateTestCaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTestCaseRequestBody.class),
            f -> f.withMarshaller(CreateTestCaseRequest::getBody, CreateTestCaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse> createTestCaseInPlan =
        genForCreateTestCaseInPlan();

    private static HttpRequestDef<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse> genForCreateTestCaseInPlan() {
        // basic
        HttpRequestDef.Builder<CreateTestCaseInPlanRequest, CreateTestCaseInPlanResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateTestCaseInPlanRequest.class, CreateTestCaseInPlanResponse.class)
            .withName("CreateTestCaseInPlan")
            .withUri("/v1/projects/{project_id}/plans/{plan_id}/testcases/batch-add")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTestCaseInPlanRequest::getProjectId,
                CreateTestCaseInPlanRequest::setProjectId));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTestCaseInPlanRequest::getPlanId, CreateTestCaseInPlanRequest::setPlanId));
        builder.<CreateTestCaseInPlanRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTestCaseInPlanRequestBody.class),
            f -> f.withMarshaller(CreateTestCaseInPlanRequest::getBody, CreateTestCaseInPlanRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUserDefinedUrlKeyWordRequest, CreateUserDefinedUrlKeyWordResponse> createUserDefinedUrlKeyWord =
        genForCreateUserDefinedUrlKeyWord();

    private static HttpRequestDef<CreateUserDefinedUrlKeyWordRequest, CreateUserDefinedUrlKeyWordResponse> genForCreateUserDefinedUrlKeyWord() {
        // basic
        HttpRequestDef.Builder<CreateUserDefinedUrlKeyWordRequest, CreateUserDefinedUrlKeyWordResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateUserDefinedUrlKeyWordRequest.class,
                    CreateUserDefinedUrlKeyWordResponse.class)
                .withName("CreateUserDefinedUrlKeyWord")
                .withUri("/v1/{project_id}/basic-aw")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUserDefinedUrlKeyWordRequest::getProjectId,
                CreateUserDefinedUrlKeyWordRequest::setProjectId));
        builder.<CreateBasicAwReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBasicAwReq.class),
            f -> f.withMarshaller(CreateUserDefinedUrlKeyWordRequest::getBody,
                CreateUserDefinedUrlKeyWordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVersionTestCaseRequest, CreateVersionTestCaseResponse> createVersionTestCase =
        genForCreateVersionTestCase();

    private static HttpRequestDef<CreateVersionTestCaseRequest, CreateVersionTestCaseResponse> genForCreateVersionTestCase() {
        // basic
        HttpRequestDef.Builder<CreateVersionTestCaseRequest, CreateVersionTestCaseResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateVersionTestCaseRequest.class, CreateVersionTestCaseResponse.class)
            .withName("CreateVersionTestCase")
            .withUri("/GT3KServer/v4/versions/{version_id}/testcases")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVersionTestCaseRequest::getVersionId,
                CreateVersionTestCaseRequest::setVersionId));
        builder.<TestCaseInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TestCaseInfo.class),
            f -> f.withMarshaller(CreateVersionTestCaseRequest::getBody, CreateVersionTestCaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBasicAwByIdRequest, DeleteBasicAwByIdResponse> deleteBasicAwById =
        genForDeleteBasicAwById();

    private static HttpRequestDef<DeleteBasicAwByIdRequest, DeleteBasicAwByIdResponse> genForDeleteBasicAwById() {
        // basic
        HttpRequestDef.Builder<DeleteBasicAwByIdRequest, DeleteBasicAwByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBasicAwByIdRequest.class, DeleteBasicAwByIdResponse.class)
                .withName("DeleteBasicAwById")
                .withUri("/v3/{project_id}/basic-aw/{aw_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBasicAwByIdRequest::getProjectId, DeleteBasicAwByIdRequest::setProjectId));
        builder.<String>withRequestField("aw_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBasicAwByIdRequest::getAwId, DeleteBasicAwByIdRequest::setAwId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFacotrByIdRequest, DeleteFacotrByIdResponse> deleteFacotrById =
        genForDeleteFacotrById();

    private static HttpRequestDef<DeleteFacotrByIdRequest, DeleteFacotrByIdResponse> genForDeleteFacotrById() {
        // basic
        HttpRequestDef.Builder<DeleteFacotrByIdRequest, DeleteFacotrByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFacotrByIdRequest.class, DeleteFacotrByIdResponse.class)
                .withName("DeleteFacotrById")
                .withUri("/v1/{project_id}/factor/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFacotrByIdRequest::getProjectId, DeleteFacotrByIdRequest::setProjectId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFacotrByIdRequest::getId, DeleteFacotrByIdRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRelationsByOneCaseRequest, DeleteRelationsByOneCaseResponse> deleteRelationsByOneCase =
        genForDeleteRelationsByOneCase();

    private static HttpRequestDef<DeleteRelationsByOneCaseRequest, DeleteRelationsByOneCaseResponse> genForDeleteRelationsByOneCase() {
        // basic
        HttpRequestDef.Builder<DeleteRelationsByOneCaseRequest, DeleteRelationsByOneCaseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteRelationsByOneCaseRequest.class,
                    DeleteRelationsByOneCaseResponse.class)
                .withName("DeleteRelationsByOneCase")
                .withUri("/testrelation/v4/testcases/{case_id}/relations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRelationsByOneCaseRequest::getCaseId,
                DeleteRelationsByOneCaseRequest::setCaseId));
        builder.<DeleteRelationsByOneCaseInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteRelationsByOneCaseInfo.class),
            f -> f.withMarshaller(DeleteRelationsByOneCaseRequest::getBody, DeleteRelationsByOneCaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServiceRequest, DeleteServiceResponse> deleteService =
        genForDeleteService();

    private static HttpRequestDef<DeleteServiceRequest, DeleteServiceResponse> genForDeleteService() {
        // basic
        HttpRequestDef.Builder<DeleteServiceRequest, DeleteServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteServiceRequest.class, DeleteServiceResponse.class)
                .withName("DeleteService")
                .withUri("/v1/services/{service_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteServiceRequest::getServiceId, DeleteServiceRequest::setServiceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTestCaseCommentRequest, DeleteTestCaseCommentResponse> deleteTestCaseComment =
        genForDeleteTestCaseComment();

    private static HttpRequestDef<DeleteTestCaseCommentRequest, DeleteTestCaseCommentResponse> genForDeleteTestCaseComment() {
        // basic
        HttpRequestDef.Builder<DeleteTestCaseCommentRequest, DeleteTestCaseCommentResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteTestCaseCommentRequest.class, DeleteTestCaseCommentResponse.class)
            .withName("DeleteTestCaseComment")
            .withUri("/GT3KServer/v4/{project_id}/testcases/{testcase_id}/comments/{comment_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTestCaseCommentRequest::getProjectId,
                DeleteTestCaseCommentRequest::setProjectId));
        builder.<String>withRequestField("testcase_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTestCaseCommentRequest::getTestcaseId,
                DeleteTestCaseCommentRequest::setTestcaseId));
        builder.<String>withRequestField("comment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTestCaseCommentRequest::getCommentId,
                DeleteTestCaseCommentRequest::setCommentId));
        builder.<String>withRequestField("version_uri",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTestCaseCommentRequest::getVersionUri,
                DeleteTestCaseCommentRequest::setVersionUri));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmStatisticsUsingRequest, ListAlarmStatisticsUsingResponse> listAlarmStatisticsUsing =
        genForListAlarmStatisticsUsing();

    private static HttpRequestDef<ListAlarmStatisticsUsingRequest, ListAlarmStatisticsUsingResponse> genForListAlarmStatisticsUsing() {
        // basic
        HttpRequestDef.Builder<ListAlarmStatisticsUsingRequest, ListAlarmStatisticsUsingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ListAlarmStatisticsUsingRequest.class, ListAlarmStatisticsUsingResponse.class)
                .withName("ListAlarmStatisticsUsing")
                .withUri("/v1/projects/{service_id}/dashboards/alarm/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmStatisticsUsingRequest::getServiceId,
                ListAlarmStatisticsUsingRequest::setServiceId));
        builder.<AlarmStatisticsQuery>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AlarmStatisticsQuery.class),
            f -> f.withMarshaller(ListAlarmStatisticsUsingRequest::getBody, ListAlarmStatisticsUsingRequest::setBody));

        // response
        builder.<List<AlertStatisticsDto>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAlarmStatisticsUsingResponse::getBody, ListAlarmStatisticsUsingResponse::setBody)
                .withInnerContainerType(AlertStatisticsDto.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListAlertGroupsByConditionRequest, ListAlertGroupsByConditionResponse> listAlertGroupsByCondition =
        genForListAlertGroupsByCondition();

    private static HttpRequestDef<ListAlertGroupsByConditionRequest, ListAlertGroupsByConditionResponse> genForListAlertGroupsByCondition() {
        // basic
        HttpRequestDef.Builder<ListAlertGroupsByConditionRequest, ListAlertGroupsByConditionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListAlertGroupsByConditionRequest.class,
                    ListAlertGroupsByConditionResponse.class)
                .withName("ListAlertGroupsByCondition")
                .withUri("/v1/projects/{service_id}/alert/group/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertGroupsByConditionRequest::getServiceId,
                ListAlertGroupsByConditionRequest::setServiceId));
        builder.<ListAlertGroupsByConditionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAlertGroupsByConditionRequestBody.class),
            f -> f.withMarshaller(ListAlertGroupsByConditionRequest::getBody,
                ListAlertGroupsByConditionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlertTemplatesRequest, ListAlertTemplatesResponse> listAlertTemplates =
        genForListAlertTemplates();

    private static HttpRequestDef<ListAlertTemplatesRequest, ListAlertTemplatesResponse> genForListAlertTemplates() {
        // basic
        HttpRequestDef.Builder<ListAlertTemplatesRequest, ListAlertTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlertTemplatesRequest.class, ListAlertTemplatesResponse.class)
                .withName("ListAlertTemplates")
                .withUri("/v1/projects/{service_id}/alert-templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertTemplatesRequest::getServiceId, ListAlertTemplatesRequest::setServiceId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertTemplatesRequest::getName, ListAlertTemplatesRequest::setName));
        builder.<Integer>withRequestField("pageNum",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlertTemplatesRequest::getPageNum, ListAlertTemplatesRequest::setPageNum));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlertTemplatesRequest::getPageSize, ListAlertTemplatesRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllBranchesRequest, ListAllBranchesResponse> listAllBranches =
        genForListAllBranches();

    private static HttpRequestDef<ListAllBranchesRequest, ListAllBranchesResponse> genForListAllBranches() {
        // basic
        HttpRequestDef.Builder<ListAllBranchesRequest, ListAllBranchesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllBranchesRequest.class, ListAllBranchesResponse.class)
                .withName("ListAllBranches")
                .withUri("/GT3KServer/v4/branches")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_uuid",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllBranchesRequest::getProjectUuid, ListAllBranchesRequest::setProjectUuid));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllBranchesRequest::getSortField, ListAllBranchesRequest::setSortField));
        builder.<String>withRequestField("sort_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllBranchesRequest::getSortType, ListAllBranchesRequest::setSortType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllConfigItemByTypeRequest, ListAllConfigItemByTypeResponse> listAllConfigItemByType =
        genForListAllConfigItemByType();

    private static HttpRequestDef<ListAllConfigItemByTypeRequest, ListAllConfigItemByTypeResponse> genForListAllConfigItemByType() {
        // basic
        HttpRequestDef.Builder<ListAllConfigItemByTypeRequest, ListAllConfigItemByTypeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListAllConfigItemByTypeRequest.class, ListAllConfigItemByTypeResponse.class)
            .withName("ListAllConfigItemByType")
            .withUri("/v1/projects/{service_id}/service/configs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllConfigItemByTypeRequest::getServiceId,
                ListAllConfigItemByTypeRequest::setServiceId));
        builder.<ListAllConfigItemByTypeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAllConfigItemByTypeRequestBody.class),
            f -> f.withMarshaller(ListAllConfigItemByTypeRequest::getBody, ListAllConfigItemByTypeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllIteratorsRequest, ListAllIteratorsResponse> listAllIterators =
        genForListAllIterators();

    private static HttpRequestDef<ListAllIteratorsRequest, ListAllIteratorsResponse> genForListAllIterators() {
        // basic
        HttpRequestDef.Builder<ListAllIteratorsRequest, ListAllIteratorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAllIteratorsRequest.class, ListAllIteratorsResponse.class)
                .withName("ListAllIterators")
                .withUri("/GT3KServer/v4/projects/{project_id}/iterator-infos")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllIteratorsRequest::getProjectId, ListAllIteratorsRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllTestCasesRequest, ListAllTestCasesResponse> listAllTestCases =
        genForListAllTestCases();

    private static HttpRequestDef<ListAllTestCasesRequest, ListAllTestCasesResponse> genForListAllTestCases() {
        // basic
        HttpRequestDef.Builder<ListAllTestCasesRequest, ListAllTestCasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAllTestCasesRequest.class, ListAllTestCasesResponse.class)
                .withName("ListAllTestCases")
                .withUri("/GT3KServer/v4/{project_id}/testcases/batch-query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllTestCasesRequest::getProjectId, ListAllTestCasesRequest::setProjectId));
        builder.<TestCasesQueryInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TestCasesQueryInfo.class),
            f -> f.withMarshaller(ListAllTestCasesRequest::getBody, ListAllTestCasesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAttachmentsRequest, ListAttachmentsResponse> listAttachments =
        genForListAttachments();

    private static HttpRequestDef<ListAttachmentsRequest, ListAttachmentsResponse> genForListAttachments() {
        // basic
        HttpRequestDef.Builder<ListAttachmentsRequest, ListAttachmentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAttachmentsRequest.class, ListAttachmentsResponse.class)
                .withName("ListAttachments")
                .withUri("/GT3KServer/v4/{project_id}/resources/{resource_uri}/attachments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttachmentsRequest::getProjectId, ListAttachmentsRequest::setProjectId));
        builder.<String>withRequestField("resource_uri",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttachmentsRequest::getResourceUri, ListAttachmentsRequest::setResourceUri));
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttachmentsRequest::getResourceType, ListAttachmentsRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailableConfigRequest, ListAvailableConfigResponse> listAvailableConfig =
        genForListAvailableConfig();

    private static HttpRequestDef<ListAvailableConfigRequest, ListAvailableConfigResponse> genForListAvailableConfig() {
        // basic
        HttpRequestDef.Builder<ListAvailableConfigRequest, ListAvailableConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAvailableConfigRequest.class, ListAvailableConfigResponse.class)
                .withName("ListAvailableConfig")
                .withUri("/v1/{project_id}/available/config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAvailableConfigRequest::getProjectId, ListAvailableConfigRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBasicAwRequest, ListBasicAwResponse> listBasicAw = genForListBasicAw();

    private static HttpRequestDef<ListBasicAwRequest, ListBasicAwResponse> genForListBasicAw() {
        // basic
        HttpRequestDef.Builder<ListBasicAwRequest, ListBasicAwResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBasicAwRequest.class, ListBasicAwResponse.class)
                .withName("ListBasicAw")
                .withUri("/v3/{project_id}/basic-aw/{aw_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBasicAwRequest::getProjectId, ListBasicAwRequest::setProjectId));
        builder.<String>withRequestField("aw_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBasicAwRequest::getAwId, ListBasicAwRequest::setAwId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBasicAwInfoListSupportsSearchRequest, ListBasicAwInfoListSupportsSearchResponse> listBasicAwInfoListSupportsSearch =
        genForListBasicAwInfoListSupportsSearch();

    private static HttpRequestDef<ListBasicAwInfoListSupportsSearchRequest, ListBasicAwInfoListSupportsSearchResponse> genForListBasicAwInfoListSupportsSearch() {
        // basic
        HttpRequestDef.Builder<ListBasicAwInfoListSupportsSearchRequest, ListBasicAwInfoListSupportsSearchResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListBasicAwInfoListSupportsSearchRequest.class,
                    ListBasicAwInfoListSupportsSearchResponse.class)
                .withName("ListBasicAwInfoListSupportsSearch")
                .withUri("/v4/{project_id}/aw-cata/aw-info-list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBasicAwInfoListSupportsSearchRequest::getProjectId,
                ListBasicAwInfoListSupportsSearchRequest::setProjectId));
        builder.<String>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBasicAwInfoListSupportsSearchRequest::getPageNo,
                ListBasicAwInfoListSupportsSearchRequest::setPageNo));
        builder.<String>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBasicAwInfoListSupportsSearchRequest::getPageSize,
                ListBasicAwInfoListSupportsSearchRequest::setPageSize));
        builder.<String>withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBasicAwInfoListSupportsSearchRequest::getParentId,
                ListBasicAwInfoListSupportsSearchRequest::setParentId));
        builder.<SearchRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchRequest.class),
            f -> f.withMarshaller(ListBasicAwInfoListSupportsSearchRequest::getBody,
                ListBasicAwInfoListSupportsSearchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBranchesRequest, ListBranchesResponse> listBranches = genForListBranches();

    private static HttpRequestDef<ListBranchesRequest, ListBranchesResponse> genForListBranches() {
        // basic
        HttpRequestDef.Builder<ListBranchesRequest, ListBranchesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBranchesRequest.class, ListBranchesResponse.class)
                .withName("ListBranches")
                .withUri("/v1/{project_id}/branches")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBranchesRequest::getProjectId, ListBranchesRequest::setProjectId));
        builder.<ListBranchesRequest.SortFieldEnum>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBranchesRequest.SortFieldEnum.class),
            f -> f.withMarshaller(ListBranchesRequest::getSortField, ListBranchesRequest::setSortField));
        builder.<ListBranchesRequest.SortTypeEnum>withRequestField("sort_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBranchesRequest.SortTypeEnum.class),
            f -> f.withMarshaller(ListBranchesRequest::getSortType, ListBranchesRequest::setSortType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBranchesRequest::getOffset, ListBranchesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBranchesRequest::getLimit, ListBranchesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCasesStatusRequest, ListCasesStatusResponse> listCasesStatus =
        genForListCasesStatus();

    private static HttpRequestDef<ListCasesStatusRequest, ListCasesStatusResponse> genForListCasesStatus() {
        // basic
        HttpRequestDef.Builder<ListCasesStatusRequest, ListCasesStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListCasesStatusRequest.class, ListCasesStatusResponse.class)
                .withName("ListCasesStatus")
                .withUri("/v2/querycasestatus")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("testServiceId",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCasesStatusRequest::getTestServiceId, ListCasesStatusRequest::setTestServiceId));
        builder.<String>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCasesStatusRequest::getBody, ListCasesStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainVisibleServicesRequest, ListDomainVisibleServicesResponse> listDomainVisibleServices =
        genForListDomainVisibleServices();

    private static HttpRequestDef<ListDomainVisibleServicesRequest, ListDomainVisibleServicesResponse> genForListDomainVisibleServices() {
        // basic
        HttpRequestDef.Builder<ListDomainVisibleServicesRequest, ListDomainVisibleServicesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListDomainVisibleServicesRequest.class,
                    ListDomainVisibleServicesResponse.class)
                .withName("ListDomainVisibleServices")
                .withUri("/GT3KServer/v4/{project_id}/visible-services")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainVisibleServicesRequest::getProjectId,
                ListDomainVisibleServicesRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIssueTreeRequest, ListIssueTreeResponse> listIssueTree =
        genForListIssueTree();

    private static HttpRequestDef<ListIssueTreeRequest, ListIssueTreeResponse> genForListIssueTree() {
        // basic
        HttpRequestDef.Builder<ListIssueTreeRequest, ListIssueTreeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListIssueTreeRequest.class, ListIssueTreeResponse.class)
                .withName("ListIssueTree")
                .withUri("/GT3KServer/v4/{project_id}/versions/{version_id}/issue-tree")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssueTreeRequest::getProjectId, ListIssueTreeRequest::setProjectId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIssueTreeRequest::getVersionId, ListIssueTreeRequest::setVersionId));
        builder.<QueryIssueTreeInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryIssueTreeInfo.class),
            f -> f.withMarshaller(ListIssueTreeRequest::getBody, ListIssueTreeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIteratorIssueTreeRequest, ListIteratorIssueTreeResponse> listIteratorIssueTree =
        genForListIteratorIssueTree();

    private static HttpRequestDef<ListIteratorIssueTreeRequest, ListIteratorIssueTreeResponse> genForListIteratorIssueTree() {
        // basic
        HttpRequestDef.Builder<ListIteratorIssueTreeRequest, ListIteratorIssueTreeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListIteratorIssueTreeRequest.class, ListIteratorIssueTreeResponse.class)
            .withName("ListIteratorIssueTree")
            .withUri("/GT3KServer/v4/{project_id}/iterators/{iterator_id}/issues/batch-query")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIteratorIssueTreeRequest::getProjectId,
                ListIteratorIssueTreeRequest::setProjectId));
        builder.<String>withRequestField("iterator_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIteratorIssueTreeRequest::getIteratorId,
                ListIteratorIssueTreeRequest::setIteratorId));
        builder.<IssueTreeInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IssueTreeInfo.class),
            f -> f.withMarshaller(ListIteratorIssueTreeRequest::getBody, ListIteratorIssueTreeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIteratorsRequest, ListIteratorsResponse> listIterators =
        genForListIterators();

    private static HttpRequestDef<ListIteratorsRequest, ListIteratorsResponse> genForListIterators() {
        // basic
        HttpRequestDef.Builder<ListIteratorsRequest, ListIteratorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListIteratorsRequest.class, ListIteratorsResponse.class)
                .withName("ListIterators")
                .withUri("/GT3KServer/v4/iterators/batch-query")
                .withContentType("application/json");

        // requests
        builder.<IteratorVersionsQueryInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IteratorVersionsQueryInfo.class),
            f -> f.withMarshaller(ListIteratorsRequest::getBody, ListIteratorsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLinesUsingRequest, ListLinesUsingResponse> listLinesUsing =
        genForListLinesUsing();

    private static HttpRequestDef<ListLinesUsingRequest, ListLinesUsingResponse> genForListLinesUsing() {
        // basic
        HttpRequestDef.Builder<ListLinesUsingRequest, ListLinesUsingResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListLinesUsingRequest.class, ListLinesUsingResponse.class)
                .withName("ListLinesUsing")
                .withUri("/v2/projects/{service_id}/dashboards/lines")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLinesUsingRequest::getServiceId, ListLinesUsingRequest::setServiceId));
        builder.<DashboardDataQuery>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DashboardDataQuery.class),
            f -> f.withMarshaller(ListLinesUsingRequest::getBody, ListLinesUsingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMsgInfosUsingRequest, ListMsgInfosUsingResponse> listMsgInfosUsing =
        genForListMsgInfosUsing();

    private static HttpRequestDef<ListMsgInfosUsingRequest, ListMsgInfosUsingResponse> genForListMsgInfosUsing() {
        // basic
        HttpRequestDef.Builder<ListMsgInfosUsingRequest, ListMsgInfosUsingResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListMsgInfosUsingRequest.class, ListMsgInfosUsingResponse.class)
                .withName("ListMsgInfosUsing")
                .withUri("/v2/projects/{service_id}/dashboards/alarm/msgs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMsgInfosUsingRequest::getServiceId, ListMsgInfosUsingRequest::setServiceId));
        builder.<MsgInfoQuery>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MsgInfoQuery.class),
            f -> f.withMarshaller(ListMsgInfosUsingRequest::getBody, ListMsgInfosUsingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOwnTestCasesRequest, ListOwnTestCasesResponse> listOwnTestCases =
        genForListOwnTestCases();

    private static HttpRequestDef<ListOwnTestCasesRequest, ListOwnTestCasesResponse> genForListOwnTestCases() {
        // basic
        HttpRequestDef.Builder<ListOwnTestCasesRequest, ListOwnTestCasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOwnTestCasesRequest.class, ListOwnTestCasesResponse.class)
                .withName("ListOwnTestCases")
                .withUri("/GT3KServer/v4/current-user/testcases")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOwnTestCasesRequest::getPageNo, ListOwnTestCasesRequest::setPageNo));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOwnTestCasesRequest::getPageSize, ListOwnTestCasesRequest::setPageSize));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOwnTestCasesRequest::getSortField, ListOwnTestCasesRequest::setSortField));
        builder.<String>withRequestField("sort_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOwnTestCasesRequest::getSortType, ListOwnTestCasesRequest::setSortType));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOwnTestCasesRequest::getKeyword, ListOwnTestCasesRequest::setKeyword));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectFieldConfigsRequest, ListProjectFieldConfigsResponse> listProjectFieldConfigs =
        genForListProjectFieldConfigs();

    private static HttpRequestDef<ListProjectFieldConfigsRequest, ListProjectFieldConfigsResponse> genForListProjectFieldConfigs() {
        // basic
        HttpRequestDef.Builder<ListProjectFieldConfigsRequest, ListProjectFieldConfigsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProjectFieldConfigsRequest.class, ListProjectFieldConfigsResponse.class)
            .withName("ListProjectFieldConfigs")
            .withUri("/GT3KServer/v4/projects/{project_id}/field-configs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectFieldConfigsRequest::getProjectId,
                ListProjectFieldConfigsRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTestCaseFieldsRequest, ListProjectTestCaseFieldsResponse> listProjectTestCaseFields =
        genForListProjectTestCaseFields();

    private static HttpRequestDef<ListProjectTestCaseFieldsRequest, ListProjectTestCaseFieldsResponse> genForListProjectTestCaseFields() {
        // basic
        HttpRequestDef.Builder<ListProjectTestCaseFieldsRequest, ListProjectTestCaseFieldsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListProjectTestCaseFieldsRequest.class,
                    ListProjectTestCaseFieldsResponse.class)
                .withName("ListProjectTestCaseFields")
                .withUri("/GT3KServer/v4/{project_id}/testcase/field/batch-query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectTestCaseFieldsRequest::getProjectId,
                ListProjectTestCaseFieldsRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublicLibAndAwsRequest, ListPublicLibAndAwsResponse> listPublicLibAndAws =
        genForListPublicLibAndAws();

    private static HttpRequestDef<ListPublicLibAndAwsRequest, ListPublicLibAndAwsResponse> genForListPublicLibAndAws() {
        // basic
        HttpRequestDef.Builder<ListPublicLibAndAwsRequest, ListPublicLibAndAwsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPublicLibAndAwsRequest.class, ListPublicLibAndAwsResponse.class)
                .withName("ListPublicLibAndAws")
                .withUri("/v1/project/{project_id}/public_aw_lib_and_aws")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicLibAndAwsRequest::getProjectId, ListPublicLibAndAwsRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListReportsRequest, ListReportsResponse> listReports = genForListReports();

    private static HttpRequestDef<ListReportsRequest, ListReportsResponse> genForListReports() {
        // basic
        HttpRequestDef.Builder<ListReportsRequest, ListReportsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListReportsRequest.class, ListReportsResponse.class)
                .withName("ListReports")
                .withUri("/testreport/v4/{project_id}/versions/{version_id}/custom-reports")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReportsRequest::getProjectId, ListReportsRequest::setProjectId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReportsRequest::getVersionId, ListReportsRequest::setVersionId));
        builder.<Long>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListReportsRequest::getPageSize, ListReportsRequest::setPageSize));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListReportsRequest::getOffset, ListReportsRequest::setOffset));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListReportsRequest::getType, ListReportsRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourcePoolsRequest, ListResourcePoolsResponse> listResourcePools =
        genForListResourcePools();

    private static HttpRequestDef<ListResourcePoolsRequest, ListResourcePoolsResponse> genForListResourcePools() {
        // basic
        HttpRequestDef.Builder<ListResourcePoolsRequest, ListResourcePoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourcePoolsRequest.class, ListResourcePoolsResponse.class)
                .withName("ListResourcePools")
                .withUri("/testexecutor/v4/{project_id}/resource-pools")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourcePoolsRequest::getProjectId, ListResourcePoolsRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScattersUsingRequest, ListScattersUsingResponse> listScattersUsing =
        genForListScattersUsing();

    private static HttpRequestDef<ListScattersUsingRequest, ListScattersUsingResponse> genForListScattersUsing() {
        // basic
        HttpRequestDef.Builder<ListScattersUsingRequest, ListScattersUsingResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListScattersUsingRequest.class, ListScattersUsingResponse.class)
                .withName("ListScattersUsing")
                .withUri("/v2/projects/{service_id}/dashboards/scatters")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScattersUsingRequest::getServiceId, ListScattersUsingRequest::setServiceId));
        builder.<DashboardDataQuery>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DashboardDataQuery.class),
            f -> f.withMarshaller(ListScattersUsingRequest::getBody, ListScattersUsingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubTaskCaseOverstockUsingRequest, ListSubTaskCaseOverstockUsingResponse> listSubTaskCaseOverstockUsing =
        genForListSubTaskCaseOverstockUsing();

    private static HttpRequestDef<ListSubTaskCaseOverstockUsingRequest, ListSubTaskCaseOverstockUsingResponse> genForListSubTaskCaseOverstockUsing() {
        // basic
        HttpRequestDef.Builder<ListSubTaskCaseOverstockUsingRequest, ListSubTaskCaseOverstockUsingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSubTaskCaseOverstockUsingRequest.class,
                    ListSubTaskCaseOverstockUsingResponse.class)
                .withName("ListSubTaskCaseOverstockUsing")
                .withUri("/v1/projects/{service_id}/dashboard/statistic/block")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubTaskCaseOverstockUsingRequest::getServiceId,
                ListSubTaskCaseOverstockUsingRequest::setServiceId));
        builder.<Long>withRequestField("startTime",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSubTaskCaseOverstockUsingRequest::getStartTime,
                ListSubTaskCaseOverstockUsingRequest::setStartTime));
        builder.<Long>withRequestField("endTime",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSubTaskCaseOverstockUsingRequest::getEndTime,
                ListSubTaskCaseOverstockUsingRequest::setEndTime));
        builder.<String>withRequestField("executorType",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubTaskCaseOverstockUsingRequest::getExecutorType,
                ListSubTaskCaseOverstockUsingRequest::setExecutorType));
        builder.<String>withRequestField("label",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubTaskCaseOverstockUsingRequest::getLabel,
                ListSubTaskCaseOverstockUsingRequest::setLabel));
        builder.<String>withRequestField("locationId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSubTaskCaseOverstockUsingRequest::getLocationId,
                ListSubTaskCaseOverstockUsingRequest::setLocationId));
        builder.<Integer>withRequestField("pageNum",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubTaskCaseOverstockUsingRequest::getPageNum,
                ListSubTaskCaseOverstockUsingRequest::setPageNum));
        builder.<Integer>withRequestField("pageSize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSubTaskCaseOverstockUsingRequest::getPageSize,
                ListSubTaskCaseOverstockUsingRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTaskAssignCasesRequest, ListTaskAssignCasesResponse> listTaskAssignCases =
        genForListTaskAssignCases();

    private static HttpRequestDef<ListTaskAssignCasesRequest, ListTaskAssignCasesResponse> genForListTaskAssignCases() {
        // basic
        HttpRequestDef.Builder<ListTaskAssignCasesRequest, ListTaskAssignCasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListTaskAssignCasesRequest.class, ListTaskAssignCasesResponse.class)
                .withName("ListTaskAssignCases")
                .withUri("/GT3KServer/v4/{project_id}/tasks/{task_id}/testcases/batch-query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskAssignCasesRequest::getProjectId, ListTaskAssignCasesRequest::setProjectId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskAssignCasesRequest::getTaskId, ListTaskAssignCasesRequest::setTaskId));
        builder.<QueryTaskAssignCasesInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryTaskAssignCasesInfo.class),
            f -> f.withMarshaller(ListTaskAssignCasesRequest::getBody, ListTaskAssignCasesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTaskResultsDetailRequest, ListTaskResultsDetailResponse> listTaskResultsDetail =
        genForListTaskResultsDetail();

    private static HttpRequestDef<ListTaskResultsDetailRequest, ListTaskResultsDetailResponse> genForListTaskResultsDetail() {
        // basic
        HttpRequestDef.Builder<ListTaskResultsDetailRequest, ListTaskResultsDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTaskResultsDetailRequest.class, ListTaskResultsDetailResponse.class)
            .withName("ListTaskResultsDetail")
            .withUri("/v4/{project_uuid}/tasks/{task_uri}/results/{result_uri}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskResultsDetailRequest::getProjectUuid,
                ListTaskResultsDetailRequest::setProjectUuid));
        builder.<String>withRequestField("task_uri",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskResultsDetailRequest::getTaskUri, ListTaskResultsDetailRequest::setTaskUri));
        builder.<String>withRequestField("result_uri",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskResultsDetailRequest::getResultUri,
                ListTaskResultsDetailRequest::setResultUri));
        builder.<String>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskResultsDetailRequest::getPageNo, ListTaskResultsDetailRequest::setPageNo));
        builder.<String>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskResultsDetailRequest::getPageSize,
                ListTaskResultsDetailRequest::setPageSize));
        builder.<String>withRequestField("result",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskResultsDetailRequest::getResult, ListTaskResultsDetailRequest::setResult));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTaskTestCasesRequest, ListTaskTestCasesResponse> listTaskTestCases =
        genForListTaskTestCases();

    private static HttpRequestDef<ListTaskTestCasesRequest, ListTaskTestCasesResponse> genForListTaskTestCases() {
        // basic
        HttpRequestDef.Builder<ListTaskTestCasesRequest, ListTaskTestCasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListTaskTestCasesRequest.class, ListTaskTestCasesResponse.class)
                .withName("ListTaskTestCases")
                .withUri("/GT3KServer/v4/{project_id}/testcases/tasks/batch-query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskTestCasesRequest::getProjectId, ListTaskTestCasesRequest::setProjectId));
        builder.<QueryTaskTestCasesInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryTaskTestCasesInfo.class),
            f -> f.withMarshaller(ListTaskTestCasesRequest::getBody, ListTaskTestCasesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTasksRequest, ListTasksResponse> listTasks = genForListTasks();

    private static HttpRequestDef<ListTasksRequest, ListTasksResponse> genForListTasks() {
        // basic
        HttpRequestDef.Builder<ListTasksRequest, ListTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListTasksRequest.class, ListTasksResponse.class)
                .withName("ListTasks")
                .withUri("/GT3KServer/v4/{project_id}/versions/{version_id}/tasks/batch-query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getProjectId, ListTasksRequest::setProjectId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getVersionId, ListTasksRequest::setVersionId));
        builder.<TasksQueryInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TasksQueryInfo.class),
            f -> f.withMarshaller(ListTasksRequest::getBody, ListTasksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTestCaseCommentsRequest, ListTestCaseCommentsResponse> listTestCaseComments =
        genForListTestCaseComments();

    private static HttpRequestDef<ListTestCaseCommentsRequest, ListTestCaseCommentsResponse> genForListTestCaseComments() {
        // basic
        HttpRequestDef.Builder<ListTestCaseCommentsRequest, ListTestCaseCommentsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTestCaseCommentsRequest.class, ListTestCaseCommentsResponse.class)
            .withName("ListTestCaseComments")
            .withUri("/GT3KServer/v4/{project_id}/testcases/{testcase_id}/comments")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestCaseCommentsRequest::getProjectId,
                ListTestCaseCommentsRequest::setProjectId));
        builder.<String>withRequestField("testcase_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestCaseCommentsRequest::getTestcaseId,
                ListTestCaseCommentsRequest::setTestcaseId));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTestCaseCommentsRequest::getPageNo, ListTestCaseCommentsRequest::setPageNo));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTestCaseCommentsRequest::getPageSize, ListTestCaseCommentsRequest::setPageSize));
        builder.<String>withRequestField("version_uri",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestCaseCommentsRequest::getVersionUri,
                ListTestCaseCommentsRequest::setVersionUri));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTestCaseHistoriesRequest, ListTestCaseHistoriesResponse> listTestCaseHistories =
        genForListTestCaseHistories();

    private static HttpRequestDef<ListTestCaseHistoriesRequest, ListTestCaseHistoriesResponse> genForListTestCaseHistories() {
        // basic
        HttpRequestDef.Builder<ListTestCaseHistoriesRequest, ListTestCaseHistoriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListTestCaseHistoriesRequest.class, ListTestCaseHistoriesResponse.class)
            .withName("ListTestCaseHistories")
            .withUri("/v1/{project_id}/testcases/{testcase_id}/histories/batch-query")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestCaseHistoriesRequest::getProjectId,
                ListTestCaseHistoriesRequest::setProjectId));
        builder.<String>withRequestField("testcase_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestCaseHistoriesRequest::getTestcaseId,
                ListTestCaseHistoriesRequest::setTestcaseId));
        builder.<ListTestCaseHistoriesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTestCaseHistoriesRequestBody.class),
            f -> f.withMarshaller(ListTestCaseHistoriesRequest::getBody, ListTestCaseHistoriesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTestCaseScriptDetailRequest, ListTestCaseScriptDetailResponse> listTestCaseScriptDetail =
        genForListTestCaseScriptDetail();

    private static HttpRequestDef<ListTestCaseScriptDetailRequest, ListTestCaseScriptDetailResponse> genForListTestCaseScriptDetail() {
        // basic
        HttpRequestDef.Builder<ListTestCaseScriptDetailRequest, ListTestCaseScriptDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListTestCaseScriptDetailRequest.class, ListTestCaseScriptDetailResponse.class)
                .withName("ListTestCaseScriptDetail")
                .withUri("/v4/{project_id}/testcase/{tmss_case_uri}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestCaseScriptDetailRequest::getProjectId,
                ListTestCaseScriptDetailRequest::setProjectId));
        builder.<String>withRequestField("tmss_case_uri",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestCaseScriptDetailRequest::getTmssCaseUri,
                ListTestCaseScriptDetailRequest::setTmssCaseUri));
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestCaseScriptDetailRequest::getTaskId,
                ListTestCaseScriptDetailRequest::setTaskId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTestCaseScriptDetailResponse::getBody,
                ListTestCaseScriptDetailResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListTestCasesRequest, ListTestCasesResponse> listTestCases =
        genForListTestCases();

    private static HttpRequestDef<ListTestCasesRequest, ListTestCasesResponse> genForListTestCases() {
        // basic
        HttpRequestDef.Builder<ListTestCasesRequest, ListTestCasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListTestCasesRequest.class, ListTestCasesResponse.class)
                .withName("ListTestCases")
                .withUri("/v1/{project_id}/testcases/batch-query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestCasesRequest::getProjectId, ListTestCasesRequest::setProjectId));
        builder.<ListTestCasesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTestCasesRequestBody.class),
            f -> f.withMarshaller(ListTestCasesRequest::getBody, ListTestCasesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTestCasesByIssueRequest, ListTestCasesByIssueResponse> listTestCasesByIssue =
        genForListTestCasesByIssue();

    private static HttpRequestDef<ListTestCasesByIssueRequest, ListTestCasesByIssueResponse> genForListTestCasesByIssue() {
        // basic
        HttpRequestDef.Builder<ListTestCasesByIssueRequest, ListTestCasesByIssueResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListTestCasesByIssueRequest.class, ListTestCasesByIssueResponse.class)
            .withName("ListTestCasesByIssue")
            .withUri("/testrelation/v4/{project_id}/issues/{issue_id}/testcases/batch-query")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestCasesByIssueRequest::getProjectId,
                ListTestCasesByIssueRequest::setProjectId));
        builder.<String>withRequestField("issue_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestCasesByIssueRequest::getIssueId, ListTestCasesByIssueRequest::setIssueId));
        builder.<QueryTestCasesByIssueInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryTestCasesByIssueInfo.class),
            f -> f.withMarshaller(ListTestCasesByIssueRequest::getBody, ListTestCasesByIssueRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTestReportsByConditionRequest, ListTestReportsByConditionResponse> listTestReportsByCondition =
        genForListTestReportsByCondition();

    private static HttpRequestDef<ListTestReportsByConditionRequest, ListTestReportsByConditionResponse> genForListTestReportsByCondition() {
        // basic
        HttpRequestDef.Builder<ListTestReportsByConditionRequest, ListTestReportsByConditionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListTestReportsByConditionRequest.class,
                    ListTestReportsByConditionResponse.class)
                .withName("ListTestReportsByCondition")
                .withUri("/testreport/v4/{project_id}/test-reports")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestReportsByConditionRequest::getProjectId,
                ListTestReportsByConditionRequest::setProjectId));
        builder.<Long>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTestReportsByConditionRequest::getPageSize,
                ListTestReportsByConditionRequest::setPageSize));
        builder.<String>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestReportsByConditionRequest::getPageNo,
                ListTestReportsByConditionRequest::setPageNo));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestReportsByConditionRequest::getKeyWord,
                ListTestReportsByConditionRequest::setKeyWord));
        builder.<Boolean>withRequestField("own",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListTestReportsByConditionRequest::getOwn,
                ListTestReportsByConditionRequest::setOwn));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTestTypesRequest, ListTestTypesResponse> listTestTypes =
        genForListTestTypes();

    private static HttpRequestDef<ListTestTypesRequest, ListTestTypesResponse> genForListTestTypes() {
        // basic
        HttpRequestDef.Builder<ListTestTypesRequest, ListTestTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTestTypesRequest.class, ListTestTypesResponse.class)
                .withName("ListTestTypes")
                .withUri("/GT3KServer/v4/{project_id}/test-types")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestTypesRequest::getProjectId, ListTestTypesRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTestcasesByProjectIssuesRelationRequest, ListTestcasesByProjectIssuesRelationResponse> listTestcasesByProjectIssuesRelation =
        genForListTestcasesByProjectIssuesRelation();

    private static HttpRequestDef<ListTestcasesByProjectIssuesRelationRequest, ListTestcasesByProjectIssuesRelationResponse> genForListTestcasesByProjectIssuesRelation() {
        // basic
        HttpRequestDef.Builder<ListTestcasesByProjectIssuesRelationRequest, ListTestcasesByProjectIssuesRelationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListTestcasesByProjectIssuesRelationRequest.class,
                    ListTestcasesByProjectIssuesRelationResponse.class)
                .withName("ListTestcasesByProjectIssuesRelation")
                .withUri("/v1/{project_id}/issues/testcases/batch-query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestcasesByProjectIssuesRelationRequest::getProjectId,
                ListTestcasesByProjectIssuesRelationRequest::setProjectId));
        builder.<QueryProjectIssuesRelationTestCasesInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryProjectIssuesRelationTestCasesInfo.class),
            f -> f.withMarshaller(ListTestcasesByProjectIssuesRelationRequest::getBody,
                ListTestcasesByProjectIssuesRelationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsageInfosRequest, ListUsageInfosResponse> listUsageInfos =
        genForListUsageInfos();

    private static HttpRequestDef<ListUsageInfosRequest, ListUsageInfosResponse> genForListUsageInfos() {
        // basic
        HttpRequestDef.Builder<ListUsageInfosRequest, ListUsageInfosResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsageInfosRequest.class, ListUsageInfosResponse.class)
                .withName("ListUsageInfos")
                .withUri("/GT3KServer/v4/domain/usage")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_uuid",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsageInfosRequest::getProjectUuid, ListUsageInfosRequest::setProjectUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserDnsMappingRequest, ListUserDnsMappingResponse> listUserDnsMapping =
        genForListUserDnsMapping();

    private static HttpRequestDef<ListUserDnsMappingRequest, ListUserDnsMappingResponse> genForListUserDnsMapping() {
        // basic
        HttpRequestDef.Builder<ListUserDnsMappingRequest, ListUserDnsMappingResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserDnsMappingRequest.class, ListUserDnsMappingResponse.class)
                .withName("ListUserDnsMapping")
                .withUri("/v1/{project_id}/dns-mapping")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserDnsMappingRequest::getProjectId, ListUserDnsMappingRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserPackageUsageRequest, ListUserPackageUsageResponse> listUserPackageUsage =
        genForListUserPackageUsage();

    private static HttpRequestDef<ListUserPackageUsageRequest, ListUserPackageUsageResponse> genForListUserPackageUsage() {
        // basic
        HttpRequestDef.Builder<ListUserPackageUsageRequest, ListUserPackageUsageResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListUserPackageUsageRequest.class, ListUserPackageUsageResponse.class)
            .withName("ListUserPackageUsage")
            .withUri("/v1/projects/{project_id}/package-usage")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserPackageUsageRequest::getProjectId,
                ListUserPackageUsageRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserPopupInfoRequest, ListUserPopupInfoResponse> listUserPopupInfo =
        genForListUserPopupInfo();

    private static HttpRequestDef<ListUserPopupInfoRequest, ListUserPopupInfoResponse> genForListUserPopupInfo() {
        // basic
        HttpRequestDef.Builder<ListUserPopupInfoRequest, ListUserPopupInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUserPopupInfoRequest.class, ListUserPopupInfoResponse.class)
                .withName("ListUserPopupInfo")
                .withUri("/v1/projects/{project_id}/package-charge/popup")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUserPopupInfoRequest::getProjectId, ListUserPopupInfoRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsingGetRequest, ListUsingGetResponse> listUsingGet = genForListUsingGet();

    private static HttpRequestDef<ListUsingGetRequest, ListUsingGetResponse> genForListUsingGet() {
        // basic
        HttpRequestDef.Builder<ListUsingGetRequest, ListUsingGetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsingGetRequest.class, ListUsingGetResponse.class)
                .withName("ListUsingGet")
                .withUri("/v2/projects/{service_id}/dashboards")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsingGetRequest::getServiceId, ListUsingGetRequest::setServiceId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsingGetRequest::getName, ListUsingGetRequest::setName));
        builder.<Integer>withRequestField("page_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingGetRequest::getPageNumber, ListUsingGetRequest::setPageNumber));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsingGetRequest::getPageSize, ListUsingGetRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVariablesRequest, ListVariablesResponse> listVariables =
        genForListVariables();

    private static HttpRequestDef<ListVariablesRequest, ListVariablesResponse> genForListVariables() {
        // basic
        HttpRequestDef.Builder<ListVariablesRequest, ListVariablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVariablesRequest.class, ListVariablesResponse.class)
                .withName("ListVariables")
                .withUri("/v4/{project_id}/variables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVariablesRequest::getProjectId, ListVariablesRequest::setProjectId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVariablesRequest::getGroupId, ListVariablesRequest::setGroupId));
        builder.<String>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVariablesRequest::getPageNo, ListVariablesRequest::setPageNo));
        builder.<String>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVariablesRequest::getPageSize, ListVariablesRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveIssuesFromIteratorRequest, RemoveIssuesFromIteratorResponse> removeIssuesFromIterator =
        genForRemoveIssuesFromIterator();

    private static HttpRequestDef<RemoveIssuesFromIteratorRequest, RemoveIssuesFromIteratorResponse> genForRemoveIssuesFromIterator() {
        // basic
        HttpRequestDef.Builder<RemoveIssuesFromIteratorRequest, RemoveIssuesFromIteratorResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    RemoveIssuesFromIteratorRequest.class,
                    RemoveIssuesFromIteratorResponse.class)
                .withName("RemoveIssuesFromIterator")
                .withUri("/GT3KServer/v4/{project_id}/iterators/{iterator_id}/issues")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveIssuesFromIteratorRequest::getProjectId,
                RemoveIssuesFromIteratorRequest::setProjectId));
        builder.<String>withRequestField("iterator_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveIssuesFromIteratorRequest::getIteratorId,
                RemoveIssuesFromIteratorRequest::setIteratorId));
        builder.<RemoveIssuesInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemoveIssuesInfo.class),
            f -> f.withMarshaller(RemoveIssuesFromIteratorRequest::getBody, RemoveIssuesFromIteratorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunTestCaseRequest, RunTestCaseResponse> runTestCase = genForRunTestCase();

    private static HttpRequestDef<RunTestCaseRequest, RunTestCaseResponse> genForRunTestCase() {
        // basic
        HttpRequestDef.Builder<RunTestCaseRequest, RunTestCaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunTestCaseRequest.class, RunTestCaseResponse.class)
                .withName("RunTestCase")
                .withUri("/v1/projects/{project_id}/testcases/execution")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunTestCaseRequest::getProjectId, RunTestCaseRequest::setProjectId));
        builder.<RunTestCaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunTestCaseRequestBody.class),
            f -> f.withMarshaller(RunTestCaseRequest::getBody, RunTestCaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveTaskSettingRequest, SaveTaskSettingResponse> saveTaskSetting =
        genForSaveTaskSetting();

    private static HttpRequestDef<SaveTaskSettingRequest, SaveTaskSettingResponse> genForSaveTaskSetting() {
        // basic
        HttpRequestDef.Builder<SaveTaskSettingRequest, SaveTaskSettingResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SaveTaskSettingRequest.class, SaveTaskSettingResponse.class)
                .withName("SaveTaskSetting")
                .withUri("/v1/projects/{service_id}/task/settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveTaskSettingRequest::getServiceId, SaveTaskSettingRequest::setServiceId));
        builder.<SaveTaskSettingRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SaveTaskSettingRequestBody.class),
            f -> f.withMarshaller(SaveTaskSettingRequest::getBody, SaveTaskSettingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAllConfigValueByTypeAndKeyRequest, ShowAllConfigValueByTypeAndKeyResponse> showAllConfigValueByTypeAndKey =
        genForShowAllConfigValueByTypeAndKey();

    private static HttpRequestDef<ShowAllConfigValueByTypeAndKeyRequest, ShowAllConfigValueByTypeAndKeyResponse> genForShowAllConfigValueByTypeAndKey() {
        // basic
        HttpRequestDef.Builder<ShowAllConfigValueByTypeAndKeyRequest, ShowAllConfigValueByTypeAndKeyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAllConfigValueByTypeAndKeyRequest.class,
                    ShowAllConfigValueByTypeAndKeyResponse.class)
                .withName("ShowAllConfigValueByTypeAndKey")
                .withUri("/v1/projects/{service_id}/service/config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllConfigValueByTypeAndKeyRequest::getServiceId,
                ShowAllConfigValueByTypeAndKeyRequest::setServiceId));
        builder.<String>withRequestField("key",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllConfigValueByTypeAndKeyRequest::getKey,
                ShowAllConfigValueByTypeAndKeyRequest::setKey));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllConfigValueByTypeAndKeyRequest::getType,
                ShowAllConfigValueByTypeAndKeyRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAllFeatureChildrenRequest, ShowAllFeatureChildrenResponse> showAllFeatureChildren =
        genForShowAllFeatureChildren();

    private static HttpRequestDef<ShowAllFeatureChildrenRequest, ShowAllFeatureChildrenResponse> genForShowAllFeatureChildren() {
        // basic
        HttpRequestDef.Builder<ShowAllFeatureChildrenRequest, ShowAllFeatureChildrenResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowAllFeatureChildrenRequest.class, ShowAllFeatureChildrenResponse.class)
            .withName("ShowAllFeatureChildren")
            .withUri("/GT3KServer/v5/features/{feature_id}/children")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("feature_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAllFeatureChildrenRequest::getFeatureId,
                ShowAllFeatureChildrenRequest::setFeatureId));
        builder.<QueryTestItemTreeInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryTestItemTreeInfo.class),
            f -> f.withMarshaller(ShowAllFeatureChildrenRequest::getBody, ShowAllFeatureChildrenRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApiTestcaseHistoriesRequest, ShowApiTestcaseHistoriesResponse> showApiTestcaseHistories =
        genForShowApiTestcaseHistories();

    private static HttpRequestDef<ShowApiTestcaseHistoriesRequest, ShowApiTestcaseHistoriesResponse> genForShowApiTestcaseHistories() {
        // basic
        HttpRequestDef.Builder<ShowApiTestcaseHistoriesRequest, ShowApiTestcaseHistoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowApiTestcaseHistoriesRequest.class, ShowApiTestcaseHistoriesResponse.class)
                .withName("ShowApiTestcaseHistories")
                .withUri("/v1/{project_id}/api-testcases/{testcase_id}/execute-histories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("testcase_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiTestcaseHistoriesRequest::getTestcaseId,
                ShowApiTestcaseHistoriesRequest::setTestcaseId));
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiTestcaseHistoriesRequest::getProjectId,
                ShowApiTestcaseHistoriesRequest::setProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApiTestcaseHistoriesRequest::getOffset,
                ShowApiTestcaseHistoriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowApiTestcaseHistoriesRequest::getLimit,
                ShowApiTestcaseHistoriesRequest::setLimit));
        builder.<String>withRequestField("plan_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiTestcaseHistoriesRequest::getPlanId,
                ShowApiTestcaseHistoriesRequest::setPlanId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetRequest, ShowAssetResponse> showAsset = genForShowAsset();

    private static HttpRequestDef<ShowAssetRequest, ShowAssetResponse> genForShowAsset() {
        // basic
        HttpRequestDef.Builder<ShowAssetRequest, ShowAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAssetRequest.class, ShowAssetResponse.class)
                .withName("ShowAsset")
                .withUri("/v1/{project_id}/asset")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetRequest::getProjectId, ShowAssetRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAssetTreeRequest, ShowAssetTreeResponse> showAssetTree =
        genForShowAssetTree();

    private static HttpRequestDef<ShowAssetTreeRequest, ShowAssetTreeResponse> genForShowAssetTree() {
        // basic
        HttpRequestDef.Builder<ShowAssetTreeRequest, ShowAssetTreeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAssetTreeRequest.class, ShowAssetTreeResponse.class)
                .withName("ShowAssetTree")
                .withUri("/v1/{project_id}/asset-tree/{asset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetTreeRequest::getProjectId, ShowAssetTreeRequest::setProjectId));
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAssetTreeRequest::getAssetId, ShowAssetTreeRequest::setAssetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackgroundInfoRequest, ShowBackgroundInfoResponse> showBackgroundInfo =
        genForShowBackgroundInfo();

    private static HttpRequestDef<ShowBackgroundInfoRequest, ShowBackgroundInfoResponse> genForShowBackgroundInfo() {
        // basic
        HttpRequestDef.Builder<ShowBackgroundInfoRequest, ShowBackgroundInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBackgroundInfoRequest.class, ShowBackgroundInfoResponse.class)
                .withName("ShowBackgroundInfo")
                .withUri("/GT3KServer/v4/{project_id}/background")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackgroundInfoRequest::getProjectId, ShowBackgroundInfoRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBranchRequest, ShowBranchResponse> showBranch = genForShowBranch();

    private static HttpRequestDef<ShowBranchRequest, ShowBranchResponse> genForShowBranch() {
        // basic
        HttpRequestDef.Builder<ShowBranchRequest, ShowBranchResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBranchRequest.class, ShowBranchResponse.class)
                .withName("ShowBranch")
                .withUri("/GT3KServer/v4/branches/{branch_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("branch_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBranchRequest::getBranchId, ShowBranchRequest::setBranchId));
        builder.<String>withRequestField("project_uuid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBranchRequest::getProjectUuid, ShowBranchRequest::setProjectUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCaseResultRequest, ShowCaseResultResponse> showCaseResult =
        genForShowCaseResult();

    private static HttpRequestDef<ShowCaseResultRequest, ShowCaseResultResponse> genForShowCaseResult() {
        // basic
        HttpRequestDef.Builder<ShowCaseResultRequest, ShowCaseResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowCaseResultRequest.class, ShowCaseResultResponse.class)
                .withName("ShowCaseResult")
                .withUri("/v4/{project_id}/versions/{version_uri}/testcases/{case_uri}/results/batch-query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCaseResultRequest::getProjectId, ShowCaseResultRequest::setProjectId));
        builder.<String>withRequestField("version_uri",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCaseResultRequest::getVersionUri, ShowCaseResultRequest::setVersionUri));
        builder.<String>withRequestField("case_uri",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCaseResultRequest::getCaseUri, ShowCaseResultRequest::setCaseUri));
        builder.<QueryCaseResultInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryCaseResultInfo.class),
            f -> f.withMarshaller(ShowCaseResultRequest::getBody, ShowCaseResultRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConcurrencyPackageUsingRequest, ShowConcurrencyPackageUsingResponse> showConcurrencyPackageUsing =
        genForShowConcurrencyPackageUsing();

    private static HttpRequestDef<ShowConcurrencyPackageUsingRequest, ShowConcurrencyPackageUsingResponse> genForShowConcurrencyPackageUsing() {
        // basic
        HttpRequestDef.Builder<ShowConcurrencyPackageUsingRequest, ShowConcurrencyPackageUsingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowConcurrencyPackageUsingRequest.class,
                    ShowConcurrencyPackageUsingResponse.class)
                .withName("ShowConcurrencyPackageUsing")
                .withUri("/v1/echotest/concurrency/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConcurrencyPackageUsingRequest::getServiceId,
                ShowConcurrencyPackageUsingRequest::setServiceId));
        builder.<String>withRequestField("test_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConcurrencyPackageUsingRequest::getTestType,
                ShowConcurrencyPackageUsingRequest::setTestType));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowConcurrencyPackageUsingResponse::getBody,
                ShowConcurrencyPackageUsingResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowDisclaimerRecordRequest, ShowDisclaimerRecordResponse> showDisclaimerRecord =
        genForShowDisclaimerRecord();

    private static HttpRequestDef<ShowDisclaimerRecordRequest, ShowDisclaimerRecordResponse> genForShowDisclaimerRecord() {
        // basic
        HttpRequestDef.Builder<ShowDisclaimerRecordRequest, ShowDisclaimerRecordResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDisclaimerRecordRequest.class, ShowDisclaimerRecordResponse.class)
            .withName("ShowDisclaimerRecord")
            .withUri("/GT3KServer/v4/disclaimer")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDisclaimerRecordRequest::getType, ShowDisclaimerRecordRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainInfoRequest, ShowDomainInfoResponse> showDomainInfo =
        genForShowDomainInfo();

    private static HttpRequestDef<ShowDomainInfoRequest, ShowDomainInfoResponse> genForShowDomainInfo() {
        // basic
        HttpRequestDef.Builder<ShowDomainInfoRequest, ShowDomainInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainInfoRequest.class, ShowDomainInfoResponse.class)
                .withName("ShowDomainInfo")
                .withUri("/GT3KServer/v4/user-info/domain")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEchoTestPackageUsingRequest, ShowEchoTestPackageUsingResponse> showEchoTestPackageUsing =
        genForShowEchoTestPackageUsing();

    private static HttpRequestDef<ShowEchoTestPackageUsingRequest, ShowEchoTestPackageUsingResponse> genForShowEchoTestPackageUsing() {
        // basic
        HttpRequestDef.Builder<ShowEchoTestPackageUsingRequest, ShowEchoTestPackageUsingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowEchoTestPackageUsingRequest.class, ShowEchoTestPackageUsingResponse.class)
                .withName("ShowEchoTestPackageUsing")
                .withUri("/v1/projects/{service_id}/package/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEchoTestPackageUsingRequest::getServiceId,
                ShowEchoTestPackageUsingRequest::setServiceId));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(ShowEchoTestPackageUsingResponse::getBody,
                ShowEchoTestPackageUsingResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowFactorByAssetIdRequest, ShowFactorByAssetIdResponse> showFactorByAssetId =
        genForShowFactorByAssetId();

    private static HttpRequestDef<ShowFactorByAssetIdRequest, ShowFactorByAssetIdResponse> genForShowFactorByAssetId() {
        // basic
        HttpRequestDef.Builder<ShowFactorByAssetIdRequest, ShowFactorByAssetIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowFactorByAssetIdRequest.class, ShowFactorByAssetIdResponse.class)
                .withName("ShowFactorByAssetId")
                .withUri("/v1/{project_id}/factor/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFactorByAssetIdRequest::getProjectId, ShowFactorByAssetIdRequest::setProjectId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFactorByAssetIdRequest::getId, ShowFactorByAssetIdRequest::setId));
        builder.<CommRequestListFactorParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CommRequestListFactorParam.class),
            f -> f.withMarshaller(ShowFactorByAssetIdRequest::getBody, ShowFactorByAssetIdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFactorByIdRequest, ShowFactorByIdResponse> showFactorById =
        genForShowFactorById();

    private static HttpRequestDef<ShowFactorByIdRequest, ShowFactorByIdResponse> genForShowFactorById() {
        // basic
        HttpRequestDef.Builder<ShowFactorByIdRequest, ShowFactorByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFactorByIdRequest.class, ShowFactorByIdResponse.class)
                .withName("ShowFactorById")
                .withUri("/v1/{project_id}/factor/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFactorByIdRequest::getProjectId, ShowFactorByIdRequest::setProjectId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFactorByIdRequest::getId, ShowFactorByIdRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFeatureChildrenRequest, ShowFeatureChildrenResponse> showFeatureChildren =
        genForShowFeatureChildren();

    private static HttpRequestDef<ShowFeatureChildrenRequest, ShowFeatureChildrenResponse> genForShowFeatureChildren() {
        // basic
        HttpRequestDef.Builder<ShowFeatureChildrenRequest, ShowFeatureChildrenResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowFeatureChildrenRequest.class, ShowFeatureChildrenResponse.class)
                .withName("ShowFeatureChildren")
                .withUri("/GT3KServer/v4/features/{feature_id}/children")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("feature_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFeatureChildrenRequest::getFeatureId, ShowFeatureChildrenRequest::setFeatureId));
        builder.<QueryTestItemTreeInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryTestItemTreeInfo.class),
            f -> f.withMarshaller(ShowFeatureChildrenRequest::getBody, ShowFeatureChildrenRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFreeDeclarationRequest, ShowFreeDeclarationResponse> showFreeDeclaration =
        genForShowFreeDeclaration();

    private static HttpRequestDef<ShowFreeDeclarationRequest, ShowFreeDeclarationResponse> genForShowFreeDeclaration() {
        // basic
        HttpRequestDef.Builder<ShowFreeDeclarationRequest, ShowFreeDeclarationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFreeDeclarationRequest.class, ShowFreeDeclarationResponse.class)
                .withName("ShowFreeDeclaration")
                .withUri("/GT3KServer/v4/free-declaration")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIfTaskNameRepeatRequest, ShowIfTaskNameRepeatResponse> showIfTaskNameRepeat =
        genForShowIfTaskNameRepeat();

    private static HttpRequestDef<ShowIfTaskNameRepeatRequest, ShowIfTaskNameRepeatResponse> genForShowIfTaskNameRepeat() {
        // basic
        HttpRequestDef.Builder<ShowIfTaskNameRepeatRequest, ShowIfTaskNameRepeatResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowIfTaskNameRepeatRequest.class, ShowIfTaskNameRepeatResponse.class)
            .withName("ShowIfTaskNameRepeat")
            .withUri("/v1/projects/{service_id}/alert-templates/name")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIfTaskNameRepeatRequest::getServiceId,
                ShowIfTaskNameRepeatRequest::setServiceId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIfTaskNameRepeatRequest::getId, ShowIfTaskNameRepeatRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIfTaskNameRepeatRequest::getName, ShowIfTaskNameRepeatRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIfUserNameRepeatRequest, ShowIfUserNameRepeatResponse> showIfUserNameRepeat =
        genForShowIfUserNameRepeat();

    private static HttpRequestDef<ShowIfUserNameRepeatRequest, ShowIfUserNameRepeatResponse> genForShowIfUserNameRepeat() {
        // basic
        HttpRequestDef.Builder<ShowIfUserNameRepeatRequest, ShowIfUserNameRepeatResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowIfUserNameRepeatRequest.class, ShowIfUserNameRepeatResponse.class)
            .withName("ShowIfUserNameRepeat")
            .withUri("/v1/projects/{service_id}/alert/user/name")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIfUserNameRepeatRequest::getServiceId,
                ShowIfUserNameRepeatRequest::setServiceId));
        builder.<String>withRequestField("userId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIfUserNameRepeatRequest::getUserId, ShowIfUserNameRepeatRequest::setUserId));
        builder.<String>withRequestField("userName",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIfUserNameRepeatRequest::getUserName, ShowIfUserNameRepeatRequest::setUserName));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowIfUserNameRepeatResponse::getBody, ShowIfUserNameRepeatResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowIssuesByPlanIdRequest, ShowIssuesByPlanIdResponse> showIssuesByPlanId =
        genForShowIssuesByPlanId();

    private static HttpRequestDef<ShowIssuesByPlanIdRequest, ShowIssuesByPlanIdResponse> genForShowIssuesByPlanId() {
        // basic
        HttpRequestDef.Builder<ShowIssuesByPlanIdRequest, ShowIssuesByPlanIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIssuesByPlanIdRequest.class, ShowIssuesByPlanIdResponse.class)
                .withName("ShowIssuesByPlanId")
                .withUri("/v1/projects/{project_id}/plans/{plan_id}/issues")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIssuesByPlanIdRequest::getProjectId, ShowIssuesByPlanIdRequest::setProjectId));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIssuesByPlanIdRequest::getPlanId, ShowIssuesByPlanIdRequest::setPlanId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowIssuesByPlanIdRequest::getOffset, ShowIssuesByPlanIdRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowIssuesByPlanIdRequest::getLimit, ShowIssuesByPlanIdRequest::setLimit));

        // response
        builder.<List<TestPlanIssueDetail>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowIssuesByPlanIdResponse::getBody, ShowIssuesByPlanIdResponse::setBody)
                .withInnerContainerType(TestPlanIssueDetail.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowIteratorByDefectRequest, ShowIteratorByDefectResponse> showIteratorByDefect =
        genForShowIteratorByDefect();

    private static HttpRequestDef<ShowIteratorByDefectRequest, ShowIteratorByDefectResponse> genForShowIteratorByDefect() {
        // basic
        HttpRequestDef.Builder<ShowIteratorByDefectRequest, ShowIteratorByDefectResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowIteratorByDefectRequest.class, ShowIteratorByDefectResponse.class)
            .withName("ShowIteratorByDefect")
            .withUri("/GT3KServer/v4/{project_id}/defects/{defect_id}/iterators")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIteratorByDefectRequest::getProjectId,
                ShowIteratorByDefectRequest::setProjectId));
        builder.<String>withRequestField("defect_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIteratorByDefectRequest::getDefectId, ShowIteratorByDefectRequest::setDefectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIteratorDetailRequest, ShowIteratorDetailResponse> showIteratorDetail =
        genForShowIteratorDetail();

    private static HttpRequestDef<ShowIteratorDetailRequest, ShowIteratorDetailResponse> genForShowIteratorDetail() {
        // basic
        HttpRequestDef.Builder<ShowIteratorDetailRequest, ShowIteratorDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIteratorDetailRequest.class, ShowIteratorDetailResponse.class)
                .withName("ShowIteratorDetail")
                .withUri("/GT3KServer/v4/iterators/{iterator_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("iterator_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIteratorDetailRequest::getIteratorId, ShowIteratorDetailRequest::setIteratorId));
        builder.<String>withRequestField("project_uuid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIteratorDetailRequest::getProjectUuid,
                ShowIteratorDetailRequest::setProjectUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMindMapByIdRequest, ShowMindMapByIdResponse> showMindMapById =
        genForShowMindMapById();

    private static HttpRequestDef<ShowMindMapByIdRequest, ShowMindMapByIdResponse> genForShowMindMapById() {
        // basic
        HttpRequestDef.Builder<ShowMindMapByIdRequest, ShowMindMapByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMindMapByIdRequest.class, ShowMindMapByIdResponse.class)
                .withName("ShowMindMapById")
                .withUri("/v1/{project_id}/mindmaps/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMindMapByIdRequest::getProjectId, ShowMindMapByIdRequest::setProjectId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMindMapByIdRequest::getId, ShowMindMapByIdRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMindmapByPageRequest, ShowMindmapByPageResponse> showMindmapByPage =
        genForShowMindmapByPage();

    private static HttpRequestDef<ShowMindmapByPageRequest, ShowMindmapByPageResponse> genForShowMindmapByPage() {
        // basic
        HttpRequestDef.Builder<ShowMindmapByPageRequest, ShowMindmapByPageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowMindmapByPageRequest.class, ShowMindmapByPageResponse.class)
                .withName("ShowMindmapByPage")
                .withUri("/v3/{project_id}/mindmaps/page")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMindmapByPageRequest::getProjectId, ShowMindmapByPageRequest::setProjectId));
        builder.<CommRequestMindmapPageParamV3>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CommRequestMindmapPageParamV3.class),
            f -> f.withMarshaller(ShowMindmapByPageRequest::getBody, ShowMindmapByPageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMindmapCreatorNameRequest, ShowMindmapCreatorNameResponse> showMindmapCreatorName =
        genForShowMindmapCreatorName();

    private static HttpRequestDef<ShowMindmapCreatorNameRequest, ShowMindmapCreatorNameResponse> genForShowMindmapCreatorName() {
        // basic
        HttpRequestDef.Builder<ShowMindmapCreatorNameRequest, ShowMindmapCreatorNameResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowMindmapCreatorNameRequest.class, ShowMindmapCreatorNameResponse.class)
            .withName("ShowMindmapCreatorName")
            .withUri("/v2/{project_id}/mindmap-creator-name")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMindmapCreatorNameRequest::getProjectId,
                ShowMindmapCreatorNameRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOperationalDataCurrentMonthUsingRequest, ShowOperationalDataCurrentMonthUsingResponse> showOperationalDataCurrentMonthUsing =
        genForShowOperationalDataCurrentMonthUsing();

    private static HttpRequestDef<ShowOperationalDataCurrentMonthUsingRequest, ShowOperationalDataCurrentMonthUsingResponse> genForShowOperationalDataCurrentMonthUsing() {
        // basic
        HttpRequestDef.Builder<ShowOperationalDataCurrentMonthUsingRequest, ShowOperationalDataCurrentMonthUsingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowOperationalDataCurrentMonthUsingRequest.class,
                    ShowOperationalDataCurrentMonthUsingResponse.class)
                .withName("ShowOperationalDataCurrentMonthUsing")
                .withUri("/v2/projects/{service_id}/dashboard/run-panel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOperationalDataCurrentMonthUsingRequest::getServiceId,
                ShowOperationalDataCurrentMonthUsingRequest::setServiceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPlanJournalsRequest, ShowPlanJournalsResponse> showPlanJournals =
        genForShowPlanJournals();

    private static HttpRequestDef<ShowPlanJournalsRequest, ShowPlanJournalsResponse> genForShowPlanJournals() {
        // basic
        HttpRequestDef.Builder<ShowPlanJournalsRequest, ShowPlanJournalsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPlanJournalsRequest.class, ShowPlanJournalsResponse.class)
                .withName("ShowPlanJournals")
                .withUri("/v1/projects/{project_id}/plans/{plan_id}/journals")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlanJournalsRequest::getProjectId, ShowPlanJournalsRequest::setProjectId));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlanJournalsRequest::getPlanId, ShowPlanJournalsRequest::setPlanId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowPlanJournalsRequest::getOffset, ShowPlanJournalsRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowPlanJournalsRequest::getLimit, ShowPlanJournalsRequest::setLimit));

        // response
        builder.<List<TestPlanJournalList>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPlanJournalsResponse::getBody, ShowPlanJournalsResponse::setBody)
                .withInnerContainerType(TestPlanJournalList.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowPlanListRequest, ShowPlanListResponse> showPlanList = genForShowPlanList();

    private static HttpRequestDef<ShowPlanListRequest, ShowPlanListResponse> genForShowPlanList() {
        // basic
        HttpRequestDef.Builder<ShowPlanListRequest, ShowPlanListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPlanListRequest.class, ShowPlanListResponse.class)
                .withName("ShowPlanList")
                .withUri("/v2/projects/{project_id}/plans")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlanListRequest::getProjectId, ShowPlanListRequest::setProjectId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowPlanListRequest::getOffset, ShowPlanListRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowPlanListRequest::getLimit, ShowPlanListRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlanListRequest::getName, ShowPlanListRequest::setName));
        builder.<String>withRequestField("current_stage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlanListRequest::getCurrentStage, ShowPlanListRequest::setCurrentStage));
        builder.<String>withRequestField("branch_uri",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlanListRequest::getBranchUri, ShowPlanListRequest::setBranchUri));
        builder.<Boolean>withRequestField("query_all_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowPlanListRequest::getQueryAllVersion, ShowPlanListRequest::setQueryAllVersion));
        builder.<String>withRequestField("fix_version_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlanListRequest::getFixVersionIds, ShowPlanListRequest::setFixVersionIds));

        // response
        builder.<List<TestPlanDetail>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPlanListResponse::getBody, ShowPlanListResponse::setBody)
                .withInnerContainerType(TestPlanDetail.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowPlansRequest, ShowPlansResponse> showPlans = genForShowPlans();

    private static HttpRequestDef<ShowPlansRequest, ShowPlansResponse> genForShowPlans() {
        // basic
        HttpRequestDef.Builder<ShowPlansRequest, ShowPlansResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPlansRequest.class, ShowPlansResponse.class)
                .withName("ShowPlans")
                .withUri("/v1/projects/{project_id}/plans")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlansRequest::getProjectId, ShowPlansRequest::setProjectId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlansRequest::getName, ShowPlansRequest::setName));
        builder.<String>withRequestField("current_stage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlansRequest::getCurrentStage, ShowPlansRequest::setCurrentStage));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPlansRequest::getOffset, ShowPlansRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowPlansRequest::getLimit, ShowPlansRequest::setLimit));

        // response
        builder.<List<TestPlanDetail>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowPlansResponse::getBody, ShowPlansResponse::setBody)
                .withInnerContainerType(TestPlanDetail.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowProgressRequest, ShowProgressResponse> showProgress = genForShowProgress();

    private static HttpRequestDef<ShowProgressRequest, ShowProgressResponse> genForShowProgress() {
        // basic
        HttpRequestDef.Builder<ShowProgressRequest, ShowProgressResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProgressRequest.class, ShowProgressResponse.class)
                .withName("ShowProgress")
                .withUri("/GT3KServer/v4/progress/{operation_uri}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("operation_uri",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProgressRequest::getOperationUri, ShowProgressRequest::setOperationUri));
        builder.<String>withRequestField("project_uuid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProgressRequest::getProjectUuid, ShowProgressRequest::setProjectUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectDataDashboardRequest, ShowProjectDataDashboardResponse> showProjectDataDashboard =
        genForShowProjectDataDashboard();

    private static HttpRequestDef<ShowProjectDataDashboardRequest, ShowProjectDataDashboardResponse> genForShowProjectDataDashboard() {
        // basic
        HttpRequestDef.Builder<ShowProjectDataDashboardRequest, ShowProjectDataDashboardResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ShowProjectDataDashboardRequest.class, ShowProjectDataDashboardResponse.class)
                .withName("ShowProjectDataDashboard")
                .withUri("/v1/{project_id}/data-dashboard/overview")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectDataDashboardRequest::getProjectId,
                ShowProjectDataDashboardRequest::setProjectId));
        builder.<TestReportInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TestReportInfoRequestBody.class),
            f -> f.withMarshaller(ShowProjectDataDashboardRequest::getBody, ShowProjectDataDashboardRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRegisterServiceRequest, ShowRegisterServiceResponse> showRegisterService =
        genForShowRegisterService();

    private static HttpRequestDef<ShowRegisterServiceRequest, ShowRegisterServiceResponse> genForShowRegisterService() {
        // basic
        HttpRequestDef.Builder<ShowRegisterServiceRequest, ShowRegisterServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRegisterServiceRequest.class, ShowRegisterServiceResponse.class)
                .withName("ShowRegisterService")
                .withUri("/v1/services")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReportRequest, ShowReportResponse> showReport = genForShowReport();

    private static HttpRequestDef<ShowReportRequest, ShowReportResponse> genForShowReport() {
        // basic
        HttpRequestDef.Builder<ShowReportRequest, ShowReportResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowReportRequest.class, ShowReportResponse.class)
                .withName("ShowReport")
                .withUri("/v4/{project_id}/versions/{plan_id}/custom-reports/generate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReportRequest::getProjectId, ShowReportRequest::setProjectId));
        builder.<String>withRequestField("plan_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReportRequest::getPlanId, ShowReportRequest::setPlanId));
        builder.<GenerateReportInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GenerateReportInfo.class),
            f -> f.withMarshaller(ShowReportRequest::getBody, ShowReportRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRequirementsOverviewRequest, ShowRequirementsOverviewResponse> showRequirementsOverview =
        genForShowRequirementsOverview();

    private static HttpRequestDef<ShowRequirementsOverviewRequest, ShowRequirementsOverviewResponse> genForShowRequirementsOverview() {
        // basic
        HttpRequestDef.Builder<ShowRequirementsOverviewRequest, ShowRequirementsOverviewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ShowRequirementsOverviewRequest.class, ShowRequirementsOverviewResponse.class)
                .withName("ShowRequirementsOverview")
                .withUri("/testreport/v4/{project_id}/versions/{version_id}/requirements/overview")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRequirementsOverviewRequest::getProjectId,
                ShowRequirementsOverviewRequest::setProjectId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRequirementsOverviewRequest::getVersionId,
                ShowRequirementsOverviewRequest::setVersionId));
        builder.<QueryRequirementsOverviewInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QueryRequirementsOverviewInfo.class),
            f -> f.withMarshaller(ShowRequirementsOverviewRequest::getBody, ShowRequirementsOverviewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReviewByPageRequest, ShowReviewByPageResponse> showReviewByPage =
        genForShowReviewByPage();

    private static HttpRequestDef<ShowReviewByPageRequest, ShowReviewByPageResponse> genForShowReviewByPage() {
        // basic
        HttpRequestDef.Builder<ShowReviewByPageRequest, ShowReviewByPageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowReviewByPageRequest.class, ShowReviewByPageResponse.class)
                .withName("ShowReviewByPage")
                .withUri("/v2/{project_id}/reviews/page")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReviewByPageRequest::getProjectId, ShowReviewByPageRequest::setProjectId));
        builder.<CommRequestReviewPageParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CommRequestReviewPageParam.class),
            f -> f.withMarshaller(ShowReviewByPageRequest::getBody, ShowReviewByPageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSceneByPageRequest, ShowSceneByPageResponse> showSceneByPage =
        genForShowSceneByPage();

    private static HttpRequestDef<ShowSceneByPageRequest, ShowSceneByPageResponse> genForShowSceneByPage() {
        // basic
        HttpRequestDef.Builder<ShowSceneByPageRequest, ShowSceneByPageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowSceneByPageRequest.class, ShowSceneByPageResponse.class)
                .withName("ShowSceneByPage")
                .withUri("/v2/{project_id}/scenes/page")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSceneByPageRequest::getProjectId, ShowSceneByPageRequest::setProjectId));
        builder.<CommRequestScenePageParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CommRequestScenePageParam.class),
            f -> f.withMarshaller(ShowSceneByPageRequest::getBody, ShowSceneByPageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStatisticByIdRequest, ShowStatisticByIdResponse> showStatisticById =
        genForShowStatisticById();

    private static HttpRequestDef<ShowStatisticByIdRequest, ShowStatisticByIdResponse> genForShowStatisticById() {
        // basic
        HttpRequestDef.Builder<ShowStatisticByIdRequest, ShowStatisticByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStatisticByIdRequest.class, ShowStatisticByIdResponse.class)
                .withName("ShowStatisticById")
                .withUri("/v1/{project_id}/statistics/{mindmap_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStatisticByIdRequest::getProjectId, ShowStatisticByIdRequest::setProjectId));
        builder.<String>withRequestField("mindmap_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStatisticByIdRequest::getMindmapId, ShowStatisticByIdRequest::setMindmapId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSystemConfigsRequest, ShowSystemConfigsResponse> showSystemConfigs =
        genForShowSystemConfigs();

    private static HttpRequestDef<ShowSystemConfigsRequest, ShowSystemConfigsResponse> genForShowSystemConfigs() {
        // basic
        HttpRequestDef.Builder<ShowSystemConfigsRequest, ShowSystemConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowSystemConfigsRequest.class, ShowSystemConfigsResponse.class)
                .withName("ShowSystemConfigs")
                .withUri("/v1/{project_id}/system-config/find-all")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSystemConfigsRequest::getProjectId, ShowSystemConfigsRequest::setProjectId));
        builder.<CommRequestSystemConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CommRequestSystemConfig.class),
            f -> f.withMarshaller(ShowSystemConfigsRequest::getBody, ShowSystemConfigsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateByIdRequest, ShowTemplateByIdResponse> showTemplateById =
        genForShowTemplateById();

    private static HttpRequestDef<ShowTemplateByIdRequest, ShowTemplateByIdResponse> genForShowTemplateById() {
        // basic
        HttpRequestDef.Builder<ShowTemplateByIdRequest, ShowTemplateByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTemplateByIdRequest.class, ShowTemplateByIdResponse.class)
                .withName("ShowTemplateById")
                .withUri("/v2/{project_id}/templates/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateByIdRequest::getProjectId, ShowTemplateByIdRequest::setProjectId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateByIdRequest::getId, ShowTemplateByIdRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateByPageRequest, ShowTemplateByPageResponse> showTemplateByPage =
        genForShowTemplateByPage();

    private static HttpRequestDef<ShowTemplateByPageRequest, ShowTemplateByPageResponse> genForShowTemplateByPage() {
        // basic
        HttpRequestDef.Builder<ShowTemplateByPageRequest, ShowTemplateByPageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowTemplateByPageRequest.class, ShowTemplateByPageResponse.class)
                .withName("ShowTemplateByPage")
                .withUri("/v3/{project_id}/templates/page")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateByPageRequest::getProjectId, ShowTemplateByPageRequest::setProjectId));
        builder.<CommRequestTemplatePageParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CommRequestTemplatePageParam.class),
            f -> f.withMarshaller(ShowTemplateByPageRequest::getBody, ShowTemplateByPageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTestCaseRequest, ShowTestCaseResponse> showTestCase = genForShowTestCase();

    private static HttpRequestDef<ShowTestCaseRequest, ShowTestCaseResponse> genForShowTestCase() {
        // basic
        HttpRequestDef.Builder<ShowTestCaseRequest, ShowTestCaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTestCaseRequest.class, ShowTestCaseResponse.class)
                .withName("ShowTestCase")
                .withUri("/GT3KServer/v4/testcases/{testcase_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("testcase_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCaseRequest::getTestcaseId, ShowTestCaseRequest::setTestcaseId));
        builder.<String>withRequestField("version_uri",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCaseRequest::getVersionUri, ShowTestCaseRequest::setVersionUri));
        builder.<String>withRequestField("project_uuid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCaseRequest::getProjectUuid, ShowTestCaseRequest::setProjectUuid));
        builder.<String>withRequestField("task_uri",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCaseRequest::getTaskUri, ShowTestCaseRequest::setTaskUri));
        builder.<Boolean>withRequestField("refresh",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowTestCaseRequest::getRefresh, ShowTestCaseRequest::setRefresh));
        builder.<Boolean>withRequestField("is_recycle",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowTestCaseRequest::getIsRecycle, ShowTestCaseRequest::setIsRecycle));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTestCaseAndDefectInfoRequest, ShowTestCaseAndDefectInfoResponse> showTestCaseAndDefectInfo =
        genForShowTestCaseAndDefectInfo();

    private static HttpRequestDef<ShowTestCaseAndDefectInfoRequest, ShowTestCaseAndDefectInfoResponse> genForShowTestCaseAndDefectInfo() {
        // basic
        HttpRequestDef.Builder<ShowTestCaseAndDefectInfoRequest, ShowTestCaseAndDefectInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowTestCaseAndDefectInfoRequest.class,
                    ShowTestCaseAndDefectInfoResponse.class)
                .withName("ShowTestCaseAndDefectInfo")
                .withUri("/v1/{project_id}/testcases/defect-info/list-by-creation-time")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCaseAndDefectInfoRequest::getProjectId,
                ShowTestCaseAndDefectInfoRequest::setProjectId));
        builder.<ShowTestCaseAndDefectInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowTestCaseAndDefectInfoRequestBody.class),
            f -> f.withMarshaller(ShowTestCaseAndDefectInfoRequest::getBody,
                ShowTestCaseAndDefectInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse> showTestCaseDetail =
        genForShowTestCaseDetail();

    private static HttpRequestDef<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse> genForShowTestCaseDetail() {
        // basic
        HttpRequestDef.Builder<ShowTestCaseDetailRequest, ShowTestCaseDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTestCaseDetailRequest.class, ShowTestCaseDetailResponse.class)
                .withName("ShowTestCaseDetail")
                .withUri("/v1/projects/{project_id}/testcases/{testcase_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCaseDetailRequest::getProjectId, ShowTestCaseDetailRequest::setProjectId));
        builder.<String>withRequestField("testcase_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCaseDetailRequest::getTestcaseId, ShowTestCaseDetailRequest::setTestcaseId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response> showTestCaseDetailV2 =
        genForShowTestCaseDetailV2();

    private static HttpRequestDef<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response> genForShowTestCaseDetailV2() {
        // basic
        HttpRequestDef.Builder<ShowTestCaseDetailV2Request, ShowTestCaseDetailV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowTestCaseDetailV2Request.class, ShowTestCaseDetailV2Response.class)
            .withName("ShowTestCaseDetailV2")
            .withUri("/v1/projects/{project_id}/testcase")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCaseDetailV2Request::getProjectId,
                ShowTestCaseDetailV2Request::setProjectId));
        builder.<String>withRequestField("testcase_number",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCaseDetailV2Request::getTestcaseNumber,
                ShowTestCaseDetailV2Request::setTestcaseNumber));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTestCaseReviewsRequest, ShowTestCaseReviewsResponse> showTestCaseReviews =
        genForShowTestCaseReviews();

    private static HttpRequestDef<ShowTestCaseReviewsRequest, ShowTestCaseReviewsResponse> genForShowTestCaseReviews() {
        // basic
        HttpRequestDef.Builder<ShowTestCaseReviewsRequest, ShowTestCaseReviewsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTestCaseReviewsRequest.class, ShowTestCaseReviewsResponse.class)
                .withName("ShowTestCaseReviews")
                .withUri("/GT3KServer/v4/testcases/{testcase_uri}/review")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("testcase_uri",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCaseReviewsRequest::getTestcaseUri,
                ShowTestCaseReviewsRequest::setTestcaseUri));
        builder.<String>withRequestField("project_uuid",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCaseReviewsRequest::getProjectUuid,
                ShowTestCaseReviewsRequest::setProjectUuid));
        builder.<String>withRequestField("version_uri",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCaseReviewsRequest::getVersionUri,
                ShowTestCaseReviewsRequest::setVersionUri));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTestCaseReviewsRequest::getPageNo, ShowTestCaseReviewsRequest::setPageNo));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTestCaseReviewsRequest::getPageSize, ShowTestCaseReviewsRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTestCasesChangeStatisticsRequest, ShowTestCasesChangeStatisticsResponse> showTestCasesChangeStatistics =
        genForShowTestCasesChangeStatistics();

    private static HttpRequestDef<ShowTestCasesChangeStatisticsRequest, ShowTestCasesChangeStatisticsResponse> genForShowTestCasesChangeStatistics() {
        // basic
        HttpRequestDef.Builder<ShowTestCasesChangeStatisticsRequest, ShowTestCasesChangeStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowTestCasesChangeStatisticsRequest.class,
                    ShowTestCasesChangeStatisticsResponse.class)
                .withName("ShowTestCasesChangeStatistics")
                .withUri("/GT3KServer/v4/{project_id}/versions/{version_id}/testcases/change-statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCasesChangeStatisticsRequest::getProjectId,
                ShowTestCasesChangeStatisticsRequest::setProjectId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestCasesChangeStatisticsRequest::getVersionId,
                ShowTestCasesChangeStatisticsRequest::setVersionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTestcaseByPageRequest, ShowTestcaseByPageResponse> showTestcaseByPage =
        genForShowTestcaseByPage();

    private static HttpRequestDef<ShowTestcaseByPageRequest, ShowTestcaseByPageResponse> genForShowTestcaseByPage() {
        // basic
        HttpRequestDef.Builder<ShowTestcaseByPageRequest, ShowTestcaseByPageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowTestcaseByPageRequest.class, ShowTestcaseByPageResponse.class)
                .withName("ShowTestcaseByPage")
                .withUri("/v2/{project_id}/testcases/page")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestcaseByPageRequest::getProjectId, ShowTestcaseByPageRequest::setProjectId));
        builder.<CommRequestTestCasePageParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CommRequestTestCasePageParam.class),
            f -> f.withMarshaller(ShowTestcaseByPageRequest::getBody, ShowTestcaseByPageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTestpointByPageRequest, ShowTestpointByPageResponse> showTestpointByPage =
        genForShowTestpointByPage();

    private static HttpRequestDef<ShowTestpointByPageRequest, ShowTestpointByPageResponse> genForShowTestpointByPage() {
        // basic
        HttpRequestDef.Builder<ShowTestpointByPageRequest, ShowTestpointByPageResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowTestpointByPageRequest.class, ShowTestpointByPageResponse.class)
                .withName("ShowTestpointByPage")
                .withUri("/v2/{project_id}/testpoints/page")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestpointByPageRequest::getProjectId, ShowTestpointByPageRequest::setProjectId));
        builder.<CommRequestTestPointPageParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CommRequestTestPointPageParam.class),
            f -> f.withMarshaller(ShowTestpointByPageRequest::getBody, ShowTestpointByPageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserAccessInfoRequest, ShowUserAccessInfoResponse> showUserAccessInfo =
        genForShowUserAccessInfo();

    private static HttpRequestDef<ShowUserAccessInfoRequest, ShowUserAccessInfoResponse> genForShowUserAccessInfo() {
        // basic
        HttpRequestDef.Builder<ShowUserAccessInfoRequest, ShowUserAccessInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserAccessInfoRequest.class, ShowUserAccessInfoResponse.class)
                .withName("ShowUserAccessInfo")
                .withUri("/GT3KServer/v4/domain/info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_uuid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserAccessInfoRequest::getProjectUuid,
                ShowUserAccessInfoRequest::setProjectUuid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserExecuteTestCaseInfoRequest, ShowUserExecuteTestCaseInfoResponse> showUserExecuteTestCaseInfo =
        genForShowUserExecuteTestCaseInfo();

    private static HttpRequestDef<ShowUserExecuteTestCaseInfoRequest, ShowUserExecuteTestCaseInfoResponse> genForShowUserExecuteTestCaseInfo() {
        // basic
        HttpRequestDef.Builder<ShowUserExecuteTestCaseInfoRequest, ShowUserExecuteTestCaseInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowUserExecuteTestCaseInfoRequest.class,
                    ShowUserExecuteTestCaseInfoResponse.class)
                .withName("ShowUserExecuteTestCaseInfo")
                .withUri("/v1/{project_id}/testcases/execute-info/statistic-by-user")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserExecuteTestCaseInfoRequest::getProjectId,
                ShowUserExecuteTestCaseInfoRequest::setProjectId));
        builder.<ShowUserExecuteTestCaseInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowUserExecuteTestCaseInfoRequestBody.class),
            f -> f.withMarshaller(ShowUserExecuteTestCaseInfoRequest::getBody,
                ShowUserExecuteTestCaseInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBasicAwByIdRequest, UpdateBasicAwByIdResponse> updateBasicAwById =
        genForUpdateBasicAwById();

    private static HttpRequestDef<UpdateBasicAwByIdRequest, UpdateBasicAwByIdResponse> genForUpdateBasicAwById() {
        // basic
        HttpRequestDef.Builder<UpdateBasicAwByIdRequest, UpdateBasicAwByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateBasicAwByIdRequest.class, UpdateBasicAwByIdResponse.class)
                .withName("UpdateBasicAwById")
                .withUri("/v3/{project_id}/basic-aw/{aw_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBasicAwByIdRequest::getProjectId, UpdateBasicAwByIdRequest::setProjectId));
        builder.<String>withRequestField("aw_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBasicAwByIdRequest::getAwId, UpdateBasicAwByIdRequest::setAwId));
        builder.<UpdateBasicAwReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBasicAwReq.class),
            f -> f.withMarshaller(UpdateBasicAwByIdRequest::getBody, UpdateBasicAwByIdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIteratorRequest, UpdateIteratorResponse> updateIterator =
        genForUpdateIterator();

    private static HttpRequestDef<UpdateIteratorRequest, UpdateIteratorResponse> genForUpdateIterator() {
        // basic
        HttpRequestDef.Builder<UpdateIteratorRequest, UpdateIteratorResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIteratorRequest.class, UpdateIteratorResponse.class)
                .withName("UpdateIterator")
                .withUri("/GT3KServer/v4/iterators/{iterator_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("iterator_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIteratorRequest::getIteratorId, UpdateIteratorRequest::setIteratorId));
        builder.<IteratorVersionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IteratorVersionInfo.class),
            f -> f.withMarshaller(UpdateIteratorRequest::getBody, UpdateIteratorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServiceRequest, UpdateServiceResponse> updateService =
        genForUpdateService();

    private static HttpRequestDef<UpdateServiceRequest, UpdateServiceResponse> genForUpdateService() {
        // basic
        HttpRequestDef.Builder<UpdateServiceRequest, UpdateServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateServiceRequest.class, UpdateServiceResponse.class)
                .withName("UpdateService")
                .withUri("/v1/services/{service_id}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateServiceRequest::getServiceId, UpdateServiceRequest::setServiceId));
        builder.<ServiceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ServiceRequestBody.class),
            f -> f.withMarshaller(UpdateServiceRequest::getBody, UpdateServiceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTestCaseRequest, UpdateTestCaseResponse> updateTestCase =
        genForUpdateTestCase();

    private static HttpRequestDef<UpdateTestCaseRequest, UpdateTestCaseResponse> genForUpdateTestCase() {
        // basic
        HttpRequestDef.Builder<UpdateTestCaseRequest, UpdateTestCaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTestCaseRequest.class, UpdateTestCaseResponse.class)
                .withName("UpdateTestCase")
                .withUri("/v1/projects/{project_id}/testcases/{testcase_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTestCaseRequest::getProjectId, UpdateTestCaseRequest::setProjectId));
        builder.<String>withRequestField("testcase_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTestCaseRequest::getTestcaseId, UpdateTestCaseRequest::setTestcaseId));
        builder.<UpdateTestCaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTestCaseRequestBody.class),
            f -> f.withMarshaller(UpdateTestCaseRequest::getBody, UpdateTestCaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTestCaseAndScriptRequest, UpdateTestCaseAndScriptResponse> updateTestCaseAndScript =
        genForUpdateTestCaseAndScript();

    private static HttpRequestDef<UpdateTestCaseAndScriptRequest, UpdateTestCaseAndScriptResponse> genForUpdateTestCaseAndScript() {
        // basic
        HttpRequestDef.Builder<UpdateTestCaseAndScriptRequest, UpdateTestCaseAndScriptResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateTestCaseAndScriptRequest.class, UpdateTestCaseAndScriptResponse.class)
            .withName("UpdateTestCaseAndScript")
            .withUri("/v4/{project_id}/testcase/{tmss_case_uri}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTestCaseAndScriptRequest::getProjectId,
                UpdateTestCaseAndScriptRequest::setProjectId));
        builder.<String>withRequestField("tmss_case_uri",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTestCaseAndScriptRequest::getTmssCaseUri,
                UpdateTestCaseAndScriptRequest::setTmssCaseUri));
        builder.<Boolean>withRequestField("turn_on_awmapping",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(UpdateTestCaseAndScriptRequest::getTurnOnAwmapping,
                UpdateTestCaseAndScriptRequest::setTurnOnAwmapping));
        builder.<CreateTestCaseReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTestCaseReq.class),
            f -> f.withMarshaller(UpdateTestCaseAndScriptRequest::getBody, UpdateTestCaseAndScriptRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateTestCaseAndScriptResponse::getBody, UpdateTestCaseAndScriptResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTestCaseCommentRequest, UpdateTestCaseCommentResponse> updateTestCaseComment =
        genForUpdateTestCaseComment();

    private static HttpRequestDef<UpdateTestCaseCommentRequest, UpdateTestCaseCommentResponse> genForUpdateTestCaseComment() {
        // basic
        HttpRequestDef.Builder<UpdateTestCaseCommentRequest, UpdateTestCaseCommentResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateTestCaseCommentRequest.class, UpdateTestCaseCommentResponse.class)
            .withName("UpdateTestCaseComment")
            .withUri("/GT3KServer/v4/{project_id}/testcases/{testcase_id}/comments/{comment_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTestCaseCommentRequest::getProjectId,
                UpdateTestCaseCommentRequest::setProjectId));
        builder.<String>withRequestField("testcase_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTestCaseCommentRequest::getTestcaseId,
                UpdateTestCaseCommentRequest::setTestcaseId));
        builder.<String>withRequestField("comment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTestCaseCommentRequest::getCommentId,
                UpdateTestCaseCommentRequest::setCommentId));
        builder.<TestCaseCommentInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TestCaseCommentInfo.class),
            f -> f.withMarshaller(UpdateTestCaseCommentRequest::getBody, UpdateTestCaseCommentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse> updateTestCaseResult =
        genForUpdateTestCaseResult();

    private static HttpRequestDef<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse> genForUpdateTestCaseResult() {
        // basic
        HttpRequestDef.Builder<UpdateTestCaseResultRequest, UpdateTestCaseResultResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateTestCaseResultRequest.class, UpdateTestCaseResultResponse.class)
            .withName("UpdateTestCaseResult")
            .withUri("/v1/projects/{project_id}/testcases/result")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTestCaseResultRequest::getProjectId,
                UpdateTestCaseResultRequest::setProjectId));
        builder.<UpdateTestCaseResultRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTestCaseResultRequestBody.class),
            f -> f.withMarshaller(UpdateTestCaseResultRequest::getBody, UpdateTestCaseResultRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserDnsMappingRequest, UpdateUserDnsMappingResponse> updateUserDnsMapping =
        genForUpdateUserDnsMapping();

    private static HttpRequestDef<UpdateUserDnsMappingRequest, UpdateUserDnsMappingResponse> genForUpdateUserDnsMapping() {
        // basic
        HttpRequestDef.Builder<UpdateUserDnsMappingRequest, UpdateUserDnsMappingResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateUserDnsMappingRequest.class, UpdateUserDnsMappingResponse.class)
            .withName("UpdateUserDnsMapping")
            .withUri("/v1/{project_id}/dns-mapping")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserDnsMappingRequest::getProjectId,
                UpdateUserDnsMappingRequest::setProjectId));
        builder.<String>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserDnsMappingRequest::getBody, UpdateUserDnsMappingRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVersionTestCaseRequest, UpdateVersionTestCaseResponse> updateVersionTestCase =
        genForUpdateVersionTestCase();

    private static HttpRequestDef<UpdateVersionTestCaseRequest, UpdateVersionTestCaseResponse> genForUpdateVersionTestCase() {
        // basic
        HttpRequestDef.Builder<UpdateVersionTestCaseRequest, UpdateVersionTestCaseResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateVersionTestCaseRequest.class, UpdateVersionTestCaseResponse.class)
            .withName("UpdateVersionTestCase")
            .withUri("/GT3KServer/v4/testcases/{case_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("case_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVersionTestCaseRequest::getCaseId, UpdateVersionTestCaseRequest::setCaseId));
        builder.<TestCaseInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TestCaseInfo.class),
            f -> f.withMarshaller(UpdateVersionTestCaseRequest::getBody, UpdateVersionTestCaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse> createApiTestSuiteByRepoFile =
        genForCreateApiTestSuiteByRepoFile();

    private static HttpRequestDef<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse> genForCreateApiTestSuiteByRepoFile() {
        // basic
        HttpRequestDef.Builder<CreateApiTestSuiteByRepoFileRequest, CreateApiTestSuiteByRepoFileResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateApiTestSuiteByRepoFileRequest.class,
                    CreateApiTestSuiteByRepoFileResponse.class)
                .withName("CreateApiTestSuiteByRepoFile")
                .withUri("/v1/projects/{project_id}/repository/testsuites")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApiTestSuiteByRepoFileRequest::getProjectId,
                CreateApiTestSuiteByRepoFileRequest::setProjectId));
        builder.<CreateTestSuitByRepoFileInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTestSuitByRepoFileInfo.class),
            f -> f.withMarshaller(CreateApiTestSuiteByRepoFileRequest::getBody,
                CreateApiTestSuiteByRepoFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironments =
        genForListEnvironments();

    private static HttpRequestDef<ListEnvironmentsRequest, ListEnvironmentsResponse> genForListEnvironments() {
        // basic
        HttpRequestDef.Builder<ListEnvironmentsRequest, ListEnvironmentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEnvironmentsRequest.class, ListEnvironmentsResponse.class)
                .withName("ListEnvironments")
                .withUri("/v1/projects/{project_id}/environments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getProjectId, ListEnvironmentsRequest::setProjectId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getOffset, ListEnvironmentsRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getLimit, ListEnvironmentsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadStepImgRequest, UploadStepImgResponse> uploadStepImg =
        genForUploadStepImg();

    private static HttpRequestDef<UploadStepImgRequest, UploadStepImgResponse> genForUploadStepImg() {
        // basic
        HttpRequestDef.Builder<UploadStepImgRequest, UploadStepImgResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadStepImgRequest.class, UploadStepImgResponse.class)
                .withName("UploadStepImg")
                .withUri("/v4/{project_id}/images/upload")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadStepImgRequest::getProjectId, UploadStepImgRequest::setProjectId));
        builder.<UploadStepImgRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadStepImgRequestBody.class),
            f -> f.withMarshaller(UploadStepImgRequest::getBody, UploadStepImgRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteFacotrByIdsRequest, BatchDeleteFacotrByIdsResponse> batchDeleteFacotrByIds =
        genForBatchDeleteFacotrByIds();

    private static HttpRequestDef<BatchDeleteFacotrByIdsRequest, BatchDeleteFacotrByIdsResponse> genForBatchDeleteFacotrByIds() {
        // basic
        HttpRequestDef.Builder<BatchDeleteFacotrByIdsRequest, BatchDeleteFacotrByIdsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteFacotrByIdsRequest.class, BatchDeleteFacotrByIdsResponse.class)
            .withName("BatchDeleteFacotrByIds")
            .withUri("/v1/{project_id}/factor")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteFacotrByIdsRequest::getProjectId,
                BatchDeleteFacotrByIdsRequest::setProjectId));
        builder.<CommRequestListString>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CommRequestListString.class),
            f -> f.withMarshaller(BatchDeleteFacotrByIdsRequest::getBody, BatchDeleteFacotrByIdsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowTestCaseRequest, BatchShowTestCaseResponse> batchShowTestCase =
        genForBatchShowTestCase();

    private static HttpRequestDef<BatchShowTestCaseRequest, BatchShowTestCaseResponse> genForBatchShowTestCase() {
        // basic
        HttpRequestDef.Builder<BatchShowTestCaseRequest, BatchShowTestCaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchShowTestCaseRequest.class, BatchShowTestCaseResponse.class)
                .withName("BatchShowTestCase")
                .withUri("/v3/{project_id}/testcases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchShowTestCaseRequest::getProjectId, BatchShowTestCaseRequest::setProjectId));
        builder.<CommRequestTestCasePageParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CommRequestTestCasePageParam.class),
            f -> f.withMarshaller(BatchShowTestCaseRequest::getBody, BatchShowTestCaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAssetTreeRequest, CreateAssetTreeResponse> createAssetTree =
        genForCreateAssetTree();

    private static HttpRequestDef<CreateAssetTreeRequest, CreateAssetTreeResponse> genForCreateAssetTree() {
        // basic
        HttpRequestDef.Builder<CreateAssetTreeRequest, CreateAssetTreeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAssetTreeRequest.class, CreateAssetTreeResponse.class)
                .withName("CreateAssetTree")
                .withUri("/v1/{project_id}/asset-tree/{asset_id}/{parent_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAssetTreeRequest::getProjectId, CreateAssetTreeRequest::setProjectId));
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAssetTreeRequest::getAssetId, CreateAssetTreeRequest::setAssetId));
        builder.<String>withRequestField("parent_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAssetTreeRequest::getParentId, CreateAssetTreeRequest::setParentId));
        builder.<CommRequestAssetTree>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CommRequestAssetTree.class),
            f -> f.withMarshaller(CreateAssetTreeRequest::getBody, CreateAssetTreeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBackupMindmapRequest, CreateBackupMindmapResponse> createBackupMindmap =
        genForCreateBackupMindmap();

    private static HttpRequestDef<CreateBackupMindmapRequest, CreateBackupMindmapResponse> genForCreateBackupMindmap() {
        // basic
        HttpRequestDef.Builder<CreateBackupMindmapRequest, CreateBackupMindmapResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBackupMindmapRequest.class, CreateBackupMindmapResponse.class)
                .withName("CreateBackupMindmap")
                .withUri("/v2/{project_id}/mindmap-backups/backup")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBackupMindmapRequest::getProjectId, CreateBackupMindmapRequest::setProjectId));
        builder.<CommRequestBackUpMindmapParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CommRequestBackUpMindmapParam.class),
            f -> f.withMarshaller(CreateBackupMindmapRequest::getBody, CreateBackupMindmapRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> createTemplate =
        genForCreateTemplate();

    private static HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> genForCreateTemplate() {
        // basic
        HttpRequestDef.Builder<CreateTemplateRequest, CreateTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTemplateRequest.class, CreateTemplateResponse.class)
                .withName("CreateTemplate")
                .withUri("/v2/{project_id}/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTemplateRequest::getProjectId, CreateTemplateRequest::setProjectId));
        builder.<CommRequestSaveTemplateParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CommRequestSaveTemplateParam.class),
            f -> f.withMarshaller(CreateTemplateRequest::getBody, CreateTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAssetRequest, DeleteAssetResponse> deleteAsset = genForDeleteAsset();

    private static HttpRequestDef<DeleteAssetRequest, DeleteAssetResponse> genForDeleteAsset() {
        // basic
        HttpRequestDef.Builder<DeleteAssetRequest, DeleteAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAssetRequest.class, DeleteAssetResponse.class)
                .withName("DeleteAsset")
                .withUri("/v1/{project_id}/asset/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetRequest::getProjectId, DeleteAssetRequest::setProjectId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetRequest::getId, DeleteAssetRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAssetTreeRequest, DeleteAssetTreeResponse> deleteAssetTree =
        genForDeleteAssetTree();

    private static HttpRequestDef<DeleteAssetTreeRequest, DeleteAssetTreeResponse> genForDeleteAssetTree() {
        // basic
        HttpRequestDef.Builder<DeleteAssetTreeRequest, DeleteAssetTreeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAssetTreeRequest.class, DeleteAssetTreeResponse.class)
                .withName("DeleteAssetTree")
                .withUri("/v1/{project_id}/asset-tree/{asset_id}/{parent_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetTreeRequest::getProjectId, DeleteAssetTreeRequest::setProjectId));
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetTreeRequest::getAssetId, DeleteAssetTreeRequest::setAssetId));
        builder.<String>withRequestField("parent_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAssetTreeRequest::getParentId, DeleteAssetTreeRequest::setParentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMindmapBackupByIdRequest, DeleteMindmapBackupByIdResponse> deleteMindmapBackupById =
        genForDeleteMindmapBackupById();

    private static HttpRequestDef<DeleteMindmapBackupByIdRequest, DeleteMindmapBackupByIdResponse> genForDeleteMindmapBackupById() {
        // basic
        HttpRequestDef.Builder<DeleteMindmapBackupByIdRequest, DeleteMindmapBackupByIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteMindmapBackupByIdRequest.class, DeleteMindmapBackupByIdResponse.class)
            .withName("DeleteMindmapBackupById")
            .withUri("/v2/{project_id}/mindmap-backups/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMindmapBackupByIdRequest::getProjectId,
                DeleteMindmapBackupByIdRequest::setProjectId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMindmapBackupByIdRequest::getId, DeleteMindmapBackupByIdRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMindmapRecycleByIdRequest, DeleteMindmapRecycleByIdResponse> deleteMindmapRecycleById =
        genForDeleteMindmapRecycleById();

    private static HttpRequestDef<DeleteMindmapRecycleByIdRequest, DeleteMindmapRecycleByIdResponse> genForDeleteMindmapRecycleById() {
        // basic
        HttpRequestDef.Builder<DeleteMindmapRecycleByIdRequest, DeleteMindmapRecycleByIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteMindmapRecycleByIdRequest.class,
                    DeleteMindmapRecycleByIdResponse.class)
                .withName("DeleteMindmapRecycleById")
                .withUri("/v2/{project_id}/mindmap-recycles/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMindmapRecycleByIdRequest::getProjectId,
                DeleteMindmapRecycleByIdRequest::setProjectId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMindmapRecycleByIdRequest::getId, DeleteMindmapRecycleByIdRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateByIdRequest, DeleteTemplateByIdResponse> deleteTemplateById =
        genForDeleteTemplateById();

    private static HttpRequestDef<DeleteTemplateByIdRequest, DeleteTemplateByIdResponse> genForDeleteTemplateById() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateByIdRequest, DeleteTemplateByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTemplateByIdRequest.class, DeleteTemplateByIdResponse.class)
                .withName("DeleteTemplateById")
                .withUri("/v2/{project_id}/templates/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateByIdRequest::getProjectId, DeleteTemplateByIdRequest::setProjectId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateByIdRequest::getId, DeleteTemplateByIdRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadAssetTemplateRequest, DownloadAssetTemplateResponse> downloadAssetTemplate =
        genForDownloadAssetTemplate();

    private static HttpRequestDef<DownloadAssetTemplateRequest, DownloadAssetTemplateResponse> genForDownloadAssetTemplate() {
        // basic
        HttpRequestDef.Builder<DownloadAssetTemplateRequest, DownloadAssetTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, DownloadAssetTemplateRequest.class, DownloadAssetTemplateResponse.class)
            .withName("DownloadAssetTemplate")
            .withUri("/v1/{project_id}/asset/template")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadAssetTemplateRequest::getProjectId,
                DownloadAssetTemplateRequest::setProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportFactorRequest, ExportFactorResponse> exportFactor = genForExportFactor();

    private static HttpRequestDef<ExportFactorRequest, ExportFactorResponse> genForExportFactor() {
        // basic
        HttpRequestDef.Builder<ExportFactorRequest, ExportFactorResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportFactorRequest.class, ExportFactorResponse.class)
                .withName("ExportFactor")
                .withUri("/v1/{project_id}/asset/{asset_id}/export")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportFactorRequest::getProjectId, ExportFactorRequest::setProjectId));
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportFactorRequest::getAssetId, ExportFactorRequest::setAssetId));
        builder.<CommRequestAssetExportParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CommRequestAssetExportParam.class),
            f -> f.withMarshaller(ExportFactorRequest::getBody, ExportFactorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportAssetRequest, ImportAssetResponse> importAsset = genForImportAsset();

    private static HttpRequestDef<ImportAssetRequest, ImportAssetResponse> genForImportAsset() {
        // basic
        HttpRequestDef.Builder<ImportAssetRequest, ImportAssetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportAssetRequest.class, ImportAssetResponse.class)
                .withName("ImportAsset")
                .withUri("/v1/{project_id}/asset/import")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportAssetRequest::getProjectId, ImportAssetRequest::setProjectId));
        builder.<ImportAssetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportAssetRequestBody.class),
            f -> f.withMarshaller(ImportAssetRequest::getBody, ImportAssetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportFactorRequest, ImportFactorResponse> importFactor = genForImportFactor();

    private static HttpRequestDef<ImportFactorRequest, ImportFactorResponse> genForImportFactor() {
        // basic
        HttpRequestDef.Builder<ImportFactorRequest, ImportFactorResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportFactorRequest.class, ImportFactorResponse.class)
                .withName("ImportFactor")
                .withUri("/v1/{project_id}/asset/{asset_id}/import")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportFactorRequest::getProjectId, ImportFactorRequest::setProjectId));
        builder.<String>withRequestField("asset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportFactorRequest::getAssetId, ImportFactorRequest::setAssetId));
        builder.<ImportFactorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportFactorRequestBody.class),
            f -> f.withMarshaller(ImportFactorRequest::getBody, ImportFactorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDefaultTemplateByPageRequest, ShowDefaultTemplateByPageResponse> showDefaultTemplateByPage =
        genForShowDefaultTemplateByPage();

    private static HttpRequestDef<ShowDefaultTemplateByPageRequest, ShowDefaultTemplateByPageResponse> genForShowDefaultTemplateByPage() {
        // basic
        HttpRequestDef.Builder<ShowDefaultTemplateByPageRequest, ShowDefaultTemplateByPageResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowDefaultTemplateByPageRequest.class,
                    ShowDefaultTemplateByPageResponse.class)
                .withName("ShowDefaultTemplateByPage")
                .withUri("/v2/{project_id}/templates/templates-default")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDefaultTemplateByPageRequest::getProjectId,
                ShowDefaultTemplateByPageRequest::setProjectId));
        builder.<CommRequestGetDefaultTemplateParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CommRequestGetDefaultTemplateParam.class),
            f -> f.withMarshaller(ShowDefaultTemplateByPageRequest::getBody,
                ShowDefaultTemplateByPageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMindmapBackupByIdRequest, ShowMindmapBackupByIdResponse> showMindmapBackupById =
        genForShowMindmapBackupById();

    private static HttpRequestDef<ShowMindmapBackupByIdRequest, ShowMindmapBackupByIdResponse> genForShowMindmapBackupById() {
        // basic
        HttpRequestDef.Builder<ShowMindmapBackupByIdRequest, ShowMindmapBackupByIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowMindmapBackupByIdRequest.class, ShowMindmapBackupByIdResponse.class)
            .withName("ShowMindmapBackupById")
            .withUri("/v2/{project_id}/mindmap-backups/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMindmapBackupByIdRequest::getProjectId,
                ShowMindmapBackupByIdRequest::setProjectId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMindmapBackupByIdRequest::getId, ShowMindmapBackupByIdRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMindmapBackupByPageRequest, ShowMindmapBackupByPageResponse> showMindmapBackupByPage =
        genForShowMindmapBackupByPage();

    private static HttpRequestDef<ShowMindmapBackupByPageRequest, ShowMindmapBackupByPageResponse> genForShowMindmapBackupByPage() {
        // basic
        HttpRequestDef.Builder<ShowMindmapBackupByPageRequest, ShowMindmapBackupByPageResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowMindmapBackupByPageRequest.class, ShowMindmapBackupByPageResponse.class)
            .withName("ShowMindmapBackupByPage")
            .withUri("/v3/{project_id}/mindmap-backups/page")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMindmapBackupByPageRequest::getProjectId,
                ShowMindmapBackupByPageRequest::setProjectId));
        builder.<CommRequestMindmapBackupPageParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CommRequestMindmapBackupPageParam.class),
            f -> f.withMarshaller(ShowMindmapBackupByPageRequest::getBody, ShowMindmapBackupByPageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMindmapRecycleByIdRequest, ShowMindmapRecycleByIdResponse> showMindmapRecycleById =
        genForShowMindmapRecycleById();

    private static HttpRequestDef<ShowMindmapRecycleByIdRequest, ShowMindmapRecycleByIdResponse> genForShowMindmapRecycleById() {
        // basic
        HttpRequestDef.Builder<ShowMindmapRecycleByIdRequest, ShowMindmapRecycleByIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowMindmapRecycleByIdRequest.class, ShowMindmapRecycleByIdResponse.class)
            .withName("ShowMindmapRecycleById")
            .withUri("/v2/{project_id}/mindmap-recycles/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMindmapRecycleByIdRequest::getProjectId,
                ShowMindmapRecycleByIdRequest::setProjectId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMindmapRecycleByIdRequest::getId, ShowMindmapRecycleByIdRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMindmapRecycleByPageRequest, ShowMindmapRecycleByPageResponse> showMindmapRecycleByPage =
        genForShowMindmapRecycleByPage();

    private static HttpRequestDef<ShowMindmapRecycleByPageRequest, ShowMindmapRecycleByPageResponse> genForShowMindmapRecycleByPage() {
        // basic
        HttpRequestDef.Builder<ShowMindmapRecycleByPageRequest, ShowMindmapRecycleByPageResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ShowMindmapRecycleByPageRequest.class, ShowMindmapRecycleByPageResponse.class)
                .withName("ShowMindmapRecycleByPage")
                .withUri("/v3/{project_id}/mindmap-recycles/page")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMindmapRecycleByPageRequest::getProjectId,
                ShowMindmapRecycleByPageRequest::setProjectId));
        builder.<CommRequestMindmapRecyclePageParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CommRequestMindmapRecyclePageParam.class),
            f -> f.withMarshaller(ShowMindmapRecycleByPageRequest::getBody, ShowMindmapRecycleByPageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTestcaseByIdRequest, ShowTestcaseByIdResponse> showTestcaseById =
        genForShowTestcaseById();

    private static HttpRequestDef<ShowTestcaseByIdRequest, ShowTestcaseByIdResponse> genForShowTestcaseById() {
        // basic
        HttpRequestDef.Builder<ShowTestcaseByIdRequest, ShowTestcaseByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTestcaseByIdRequest.class, ShowTestcaseByIdResponse.class)
                .withName("ShowTestcaseById")
                .withUri("/v2/{project_id}/testcases/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestcaseByIdRequest::getProjectId, ShowTestcaseByIdRequest::setProjectId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTestcaseByIdRequest::getId, ShowTestcaseByIdRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAssetTreeRequest, UpdateAssetTreeResponse> updateAssetTree =
        genForUpdateAssetTree();

    private static HttpRequestDef<UpdateAssetTreeRequest, UpdateAssetTreeResponse> genForUpdateAssetTree() {
        // basic
        HttpRequestDef.Builder<UpdateAssetTreeRequest, UpdateAssetTreeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAssetTreeRequest.class, UpdateAssetTreeResponse.class)
                .withName("UpdateAssetTree")
                .withUri("/v1/{project_id}/asset-tree")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAssetTreeRequest::getProjectId, UpdateAssetTreeRequest::setProjectId));
        builder.<CommRequestUpdateAssetTreeParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CommRequestUpdateAssetTreeParam.class),
            f -> f.withMarshaller(UpdateAssetTreeRequest::getBody, UpdateAssetTreeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMindmapNameRequest, UpdateMindmapNameResponse> updateMindmapName =
        genForUpdateMindmapName();

    private static HttpRequestDef<UpdateMindmapNameRequest, UpdateMindmapNameResponse> genForUpdateMindmapName() {
        // basic
        HttpRequestDef.Builder<UpdateMindmapNameRequest, UpdateMindmapNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMindmapNameRequest.class, UpdateMindmapNameResponse.class)
                .withName("UpdateMindmapName")
                .withUri("/v1/{project_id}/mindmaps/{id}/name")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMindmapNameRequest::getProjectId, UpdateMindmapNameRequest::setProjectId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMindmapNameRequest::getId, UpdateMindmapNameRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMindmapNameRequest::getName, UpdateMindmapNameRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddFeatureRequest, AddFeatureResponse> addFeature = genForAddFeature();

    private static HttpRequestDef<AddFeatureRequest, AddFeatureResponse> genForAddFeature() {
        // basic
        HttpRequestDef.Builder<AddFeatureRequest, AddFeatureResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddFeatureRequest.class, AddFeatureResponse.class)
                .withName("AddFeature")
                .withUri("/v4/features")
                .withContentType("application/json");

        // requests
        builder.<AddTestItemInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddTestItemInfo.class),
            f -> f.withMarshaller(AddFeatureRequest::getBody, AddFeatureRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTestcasePlansRequest, ListTestcasePlansResponse> listTestcasePlans =
        genForListTestcasePlans();

    private static HttpRequestDef<ListTestcasePlansRequest, ListTestcasePlansResponse> genForListTestcasePlans() {
        // basic
        HttpRequestDef.Builder<ListTestcasePlansRequest, ListTestcasePlansResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListTestcasePlansRequest.class, ListTestcasePlansResponse.class)
                .withName("ListTestcasePlans")
                .withUri("/v4/{project_uuid}/branch/{branch_uri}/testcases/plans")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestcasePlansRequest::getProjectUuid, ListTestcasePlansRequest::setProjectUuid));
        builder.<String>withRequestField("branch_uri",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTestcasePlansRequest::getBranchUri, ListTestcasePlansRequest::setBranchUri));
        builder.<TestcasePlanQueryParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TestcasePlanQueryParam.class),
            f -> f.withMarshaller(ListTestcasePlansRequest::getBody, ListTestcasePlansRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTaskResultsRequest, ListTaskResultsResponse> listTaskResults =
        genForListTaskResults();

    private static HttpRequestDef<ListTaskResultsRequest, ListTaskResultsResponse> genForListTaskResults() {
        // basic
        HttpRequestDef.Builder<ListTaskResultsRequest, ListTaskResultsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTaskResultsRequest.class, ListTaskResultsResponse.class)
                .withName("ListTaskResults")
                .withUri("/v4/{project_uuid}/tasks/{task_uri}/results")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("project_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskResultsRequest::getProjectUuid, ListTaskResultsRequest::setProjectUuid));
        builder.<String>withRequestField("task_uri",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskResultsRequest::getTaskUri, ListTaskResultsRequest::setTaskUri));
        builder.<String>withRequestField("iterator_uri",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskResultsRequest::getIteratorUri, ListTaskResultsRequest::setIteratorUri));
        builder.<String>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskResultsRequest::getPageNo, ListTaskResultsRequest::setPageNo));
        builder.<String>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskResultsRequest::getPageSize, ListTaskResultsRequest::setPageSize));
        builder.<String>withRequestField("release_dev",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTaskResultsRequest::getReleaseDev, ListTaskResultsRequest::setReleaseDev));

        // response

        return builder.build();
    }

}
