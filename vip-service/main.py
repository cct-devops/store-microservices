from flask import Flask
from flask import jsonify

app = Flask(__name__)


def getIsVip(vip = True):
  isVip = {}
  isVip["isVip"] = vip
  return isVip

@app.route('/user/<code>')
def hello_world(code = None):
    try:
      integerCode = int(code)
      if integerCode % 2 == 1:
        print(getIsVip())
        return getIsVip()
      else:
        return getIsVip(False)
    except ValueError:
      return getIsVip(False)

