$(document).ready(function() {
	var solrData = $('#solrData').val();
	var cvData = $('#cvData').val();
	showSolrData(solrData);
	showCvData(cvData);
	$("#saveAreasForm").click(function(){
		saveAreasForm();
	});
});

function saveAreasForm(){
	console.log('saveAreasForm');
	var url			= 'validate/save.html';
	
	var area_ids = [];
	$('input:checkbox[name=area_ids]:checked').each(function(){
		var pos_i = area_ids.indexOf(this.value);
		if(pos_i == -1){
			area_ids.push(parseInt(this.value));
		}
	});
	var data = JSON.stringify({ "ids" : area_ids });

	$.ajax({
        url : url,
        type : "POST",
        traditional : true,
        contentType : "application/json",
        dataType : "json",
        data : data,
        success : function(data) {
        	if(data == null)
        		return;
        	
        },
        error : function (response) {
        	console.log('error');
        },
    });	    
    return false;
}

function showSolrData(solr_data){
	console.log('solr data: ');
	var solr_json = JSON.parse(solr_data);
	var html = '';
	html += '<table>';
	html += '<thead><tr>';
		html += '<th width="15%"></td>';
		html += '<th width="85%">Area</td>';
	html += '</tr></thead>';
	html += '<tbody>';
	for(var i in solr_json){
		console.log('area_id: ' + solr_json[i].areaId);
		html += '<tr>';
			html += '<td><input type="checkbox" name="area_ids" value="'+solr_json[i].areaId+'"></td>';
			html += '<td>'+solr_json[i].nome+'</td>';
		html += '</tr>';
	}
	html += '</tbody>';
	html += '</table>';
	$('#idSolrData').html(html);
	//console.log('solr data::: ' + solr_data);
}

function showCvData(cv_data){
	console.log('cv data');
	//console.log('cv data::: ' + cv_data);
}