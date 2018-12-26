function TableActions (value, row, index) {
    return [
        '<a class="like" href="javascript:void(0)" title="Edit">',
        '<i class="glyphicon glyphicon-pencil"></i>',
        '</a> ',
        '<a class="danger remove" href="javascript:void(0)" data-visitorserial="'+row.visitor_id+'" data-visitornames="'+row.visitor_names+'" data-visitorid="'+row.visitor_number+'" data-toggle="modal" data-target="#VisitorDelete" title="Remove">',
        '<i class="glyphicon glyphicon-trash"></i>',
        '</a>'
    ].join('');
}