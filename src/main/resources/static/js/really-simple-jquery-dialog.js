/**
 * jQuery Really Simple Dialog plugin 1.0
 *
 * Copyright (c) 2017 NTD3004 (https://github.com/NTD3004/JQuery-Really-Simple-Dialog)
 *
 * Samples and instructions at: 
 * https://github.com/NTD3004/JQuery-Really-Simple-Dialog
 *
 * This script is free software: you can redistribute it and/or modify it 
 * under the terms of the GNU General Public License as published by the Free 
 * Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 */

(function($) {
	$.fn.simpleAlert = function(options) {
		if (typeof options === 'undefined') options = {};

		var defaultOptions = {
	        title: 'اطلاع رسانی',
	        message: '',
	        btnLabel: 'تایید'

	    }
	    options = $.extend(defaultOptions, options);

	    this.each(function() {
	    	var $this = $(this);
	    	var html;

	    	$this.addClass('simple-dialog active');

	    	html = '<div class="simple-dialog-content">';
	    	html += '<div class="simple-dialog-header"><h3 class="title">'+options.title+'</h3><a class="simple-dialog-close" data-action="close"></a></div>';
	    	html += '<div class="simple-dialog-body"><p class="message">'+options.message+'</p></div>';
	    	html += '<div class="simple-dialog-footer"><button class="simple-dialog-button" id="closebtn" data-action="close">'+options.btnLabel+'</button></div>';
	    	html += '</div>';

	    	$this.html(html);

	    	$(document).on('click', 'button[data-action="close"]', function(e) {
				e.preventDefault();
				$(this).parents('.simple-dialog').removeClass('active');
			});
	    });

	    return this;
	};

	$.fn.simpleConfirm = function(options) {
		if (typeof options === 'undefined') options = {};

        var defaultOptions = {
	        title: 'ثبت اطلاعات',
	        message: '',
	        acceptBtnLabel: 'ثبت',
	        cancelBtnLabel: 'انصراف',
	        success: function() {},
	        cancel: function() {}
	    }
	    options = $.extend(defaultOptions, options);

	    this.each(function() {
	    	var $this = $(this);
	    	var html;

	    	$this.addClass('simple-dialog active');

	    	html = '<div class="simple-dialog-content">';
	    	html += '<div class="simple-dialog-header"><h3 class="title">'+options.title+'</h3></div>';
	    	html += '<div class="simple-dialog-body"><p class="message">'+options.message+'</p></div>';
	    	html += '<div class="simple-dialog-footer clearfix"><button id="acepbtn" \n\
class="simple-dialog-button accept" data-action="close">'+options.acceptBtnLabel+
                        '</button><button id="cancelbtn" class="simple-dialog-button cancel"\n\
 data-action="close">'+options.cancelBtnLabel+'</button></div>';
	    	html += '</div>';

	    	$this.html(html);

	    	$(document).on('click', 'button[data-action="close"]', function(e) {
				e.preventDefault();
				$(this).parents('.simple-dialog').removeClass('active');
				if($(this).hasClass('accept')) {
                                        html="";
                                        $this="";
					options.success();
                                        
				}
				if($(this).hasClass('cancel')) {
					options.cancel();
                                        html="";
				}
			});
	    });

	    return this;
	};

	$.fn.simplePrompt = function(options) {
		if (typeof options === 'undefined') options = {};

        var defaultOptions = {
	        title: 'Prompt',
	        message: '',
	        acceptBtnLabel: 'Accept',
	        cancelBtnLabel: 'Cancel',
	        success: function(result) {},
	        cancel: function(result) {}
	    }
	    options = $.extend(defaultOptions, options);

	    this.each(function() {
	    	var $this = $(this);
	    	var html;

	    	$this.addClass('simple-dialog active');

	    	html = '<div class="simple-dialog-content">';
	    	html += '<div class="simple-dialog-header"><h3 class="title">'+options.title+'</h3></div>';
	    	html += '<div class="simple-dialog-body"><p class="message">'+options.message+'</p><p class="answer"><input type="text" /></p></div>';
	    	html += '<div class="simple-dialog-footer clearfix"><a class="simple-dialog-button accept" data-action="close">'+options.acceptBtnLabel+'</a><a class="simple-dialog-button cancel"  data-action="close">'+options.cancelBtnLabel+'</a></div>';
	    	html += '</div>';

	    	$this.html(html);

	    	$(document).on('click', 'a[data-action="close"]', function(e) {
				e.preventDefault();
				var result = $('.answer input').val();
				$(this).parents('.simple-dialog').removeClass('active');
				if($(this).hasClass('accept')) {
					options.success(result);
				}
				if($(this).hasClass('cancel')) {
					options.cancel(result);
				}
			});
	    });

	    return this;
	};
})(jQuery);