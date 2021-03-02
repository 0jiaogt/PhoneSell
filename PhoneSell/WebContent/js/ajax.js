
        function createXMLHttpObject() {
            var xmlhr = [
                function () { return new XMLHttpRequest(); },
                function () { return new ActiveObject("Msxml2.XMLHTTP"); },
                function () { return new ActiveObject("Msxml3.XMLHTTP"); },
                function () { return new Acti                      veObject("Microsoft.XMLHTTP"); },
            ];
            var xhr = false;
            for (var i = 0; i < xmlhr.length; i++) {
                try {
                    xhr = xmlhr[i]();
                }
                catch (e) {
                    continue;
                }
                break;
            }
            return xhr;
        }

        function ajax(type, url, str, callback) {
            var xmlHttpRe = createXMLHttpObject();
            xmlHttpRe.onreadystatechange = function () {
                if (xmlHttpRe.readyState == 4) {
                    if (xmlHttpRe.status == 200) {
                        console.log("请求成功");
                        if (callback != null) {

                            callback(xmlHttpRe);
                        }

                    }
                }
            }
            if (type == "get") {
                url += "?" + str;
                console.log(url)
            }
            xmlHttpRe.open(type, url, true);
            if (type == "post") {
                xmlHttpRe.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
            }


            if (type == "post") {
                xmlHttpRe.send(str);
            }
            else {
                xmlHttpRe.send(null);
            }
            //	xmlHttpRe.open(type, url, true);
            //	xmlHttpRe.send(null);
        }